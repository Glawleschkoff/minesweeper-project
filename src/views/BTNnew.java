package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import common.ArrayElement;
import resources.ImageIconScale;

public class BTNnew {
	private static JButton btnNew = new JButton("");
	public BTNnew(JPanel panel) {
		panel.add(btnNew);
		btnNew.setBounds(58, 0, 59, 59);
		btnNew.setEnabled(false);
		btnNew.setIcon(new ImageIconScale("neu",60).getImage());
		
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayField.reset(panel);
				ArrayField.clear();
				ArrayElement.getFeld().clear();
				Main.setFeld();
				BTNfield.setR();
				ArrayField.neu(panel);
				btnNew.setEnabled(false);
				BTNfield.setStart();
				BTNfield.setEnd();
				BTNflag.setEnabled(true);
				LBLcounter.reset();
			}			
		});
	}
	public static void setEnabled(boolean b) {
		btnNew.setEnabled(b);
	}

}