package views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLayeredPane;

import resources.ImageIconScale;

public class BTNflag {
	private static JButton btnFlag = new JButton("");
	private static boolean pressed = false;
	private static Color color = btnFlag.getBackground();
	public BTNflag(JLayeredPane panel) {
		panel.add(btnFlag);
		btnFlag.setBounds(0, 1, 59, 59);
		btnFlag.setIcon(new ImageIconScale("fahne",60).getImage());
		
		btnFlag.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				
			    if(pressed==false) {
			    	pressed = true;
			    	btnFlag.setBackground(Color.green);
			    } else {
			    	pressed = false;
			    	btnFlag.setBackground(color);
			    	
			    }
			}
		});
	}
	public static boolean getFahne() {
		return pressed;
	}
	public static void setEnabled(boolean b) {
		btnFlag.setEnabled(b);
	}
	public static void setUnPressed() {
		pressed = false;
		btnFlag.setBackground(color);
	}
}