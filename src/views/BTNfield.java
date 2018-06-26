package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import common.ArrayElement;
import common.FreeField;
import resources.ImageIconScale;

public class BTNfield{
	private static int counter = 0;
	int current;
	private JButton button = new JButton();
	private JLabel bLabel = new JLabel();
	private JLabel nLabel = new JLabel();
	private boolean isFlag = false;
	private static boolean start = false;
	private static boolean end = false;
	BTNfield(int w, int x, int y, int z){
		current = counter;
		button.setBounds(w, x, y, z);		
		bLabel.setBounds(w+2, x, y+1, z);
		bLabel.setIcon(new ImageIconScale("bombe",23).getImage());
		nLabel.setBounds(w+9, x, y, z);
		counter++;
		button.addActionListener(new ActionListener() {		
		public void actionPerformed(ActionEvent e) {
// wenn BTNfahne gedrückt ist ...
			if(BTNflag.getFahne() & !end) {
				// und eine fahne da ist dann ... entferne fahne
				if(isFlag==true) {
					button.setIcon(null);
					isFlag = false;	
					LBLcounter.setCounter(1);
				// sonst füge fahne hinzu	
				} else if(LBLcounter.getCounter()>0) {
					button.setIcon(new ImageIconScale("fahne",23).getImage());
					isFlag = true;				
					LBLcounter.setCounter(-1);
				}
// wenn BTNfahne NICHT gedrückt ist ...				
			} else if(!end) {
				// und keine fahne da ist ...
				if(!isFlag) {
					// und es der erste zug ist ... entferne abdeckung, bombe und setze number
					if(start==false) {
						if(ArrayElement.getBomb(current)) {
							ArrayElement.getFeld().get(current).deleteBomb();
							LBLcounter.setCounter(-1);
							bLabel.setIcon(null);
							ArrayElement.resetNumber();
							ArrayElement.initNumber();
							ArrayField.initNumber();
						}
						start = true;
				    	BTNnew.setEnabled(true);
					}
					
					if(ArrayElement.getFeld().get(current).getBoolNumber()) {
						ArrayList<Integer> x = new ArrayList<Integer>();
						x = FreeField.getFreeList(current);
						for(Integer s:x) {
							ArrayField.getList().get(s).button.setVisible(false);
						}
						win();
						FreeField.clearStorage();
						x.clear();
					} else {
						button.setVisible(false);
						win();
					}
					
					
					
					// sonst enable BTNneu und decke alle restlichen bomben auf
				    if(ArrayElement.getBomb(current)) {
				    	System.out.println("Du bist auf eine Bombe getreten!");
				    	end = true;
				    	BTNflag.setEnabled(false);
				    	for(int i=0; i<200; i++) {
				    		if(ArrayElement.getBomb(i)) {
				    			ArrayField.getList().get(i).button.setVisible(false);
				    		}
				    	}
				    	for(int i=0; i<200;i++) {
							ArrayField.getList().get(i).getButton().setEnabled(false);
						}
				    }
				}
			}
		}
	});
	}
	private void win() {
		if(ArrayField.getRemain()) {
			System.out.println("Sieg!");
			end = true;
			for(int i=0; i<200;i++) {
				ArrayField.getList().get(i).getButton().setEnabled(false);
			}
			LBLwin.add();
		}
	}
	public JButton getButton() {
		return button;
	}
	public JLabel getBlabel() {
		return bLabel;
	}
	public static void setStart() {
		start=false;
	}
	public static void setEnd() {
		end=false;
	}
	public static void setR() {
		counter=0;
	}
	public JLabel getNlabel(int i) {
		if(ArrayElement.getFeld().get(i).getNumber()!=-1) {
			nLabel.setText(String.valueOf(ArrayElement.getFeld().get(i).getNumber()));
			nLabel.setFont(new Font("Arial", Font.BOLD, 20));
			switch(ArrayElement.getFeld().get(i).getNumber()) {
			case 1:
				nLabel.setForeground(Color.decode("#FF9999"));
				break;
			case 2:
				nLabel.setForeground(Color.decode("#FF6666"));
				break;
			case 3:
				nLabel.setForeground(Color.decode("#FF3333"));
				break;
			case 4:
				nLabel.setForeground(Color.decode("#FF0000"));
				break;
			case 5:
				nLabel.setForeground(Color.decode("#CC0000"));
				break;
			case 6:
				nLabel.setForeground(Color.decode("#990000"));
				break;
			case 7:
				nLabel.setForeground(Color.decode("#660000"));
				break;
			case 8:
				nLabel.setForeground(Color.decode("#330000"));
				break;
			}
		}
		return nLabel;
	}
	public JLabel getNlabel() {
		return nLabel;
	}
	public static boolean getStart() {
		return start;
	}
	public static boolean getEnd() {
		return end;
	}
}
