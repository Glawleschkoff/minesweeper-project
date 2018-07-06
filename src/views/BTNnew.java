package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLayeredPane;

import common.ArrayElement;
import resources.ImageIconScale;

public class BTNnew {
	private static JButton btnNew = new JButton("");
	private static JLayeredPane pane;
	public BTNnew(JLayeredPane panel) {
		pane = panel;
		panel.add(btnNew);
		btnNew.setBounds(58, 1, 59, 59);
		btnNew.setEnabled(false);
		btnNew.setIcon(new ImageIconScale("neu",60).getImage());
		btnNew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				neu();
			}			
		});
	}
	public static void setEnabled(boolean b) {
		btnNew.setEnabled(b);
	}
	public static void neu() {
		ArrayField.reset(pane);
		ArrayField.clear();
		ArrayElement.getFeld().clear();
		Main.setFeld();
		BTNfield.setR();
		ArrayField.neu(pane);
		btnNew.setEnabled(false);
		BTNfield.setStart();
		BTNfield.setEnd();
		BTNflag.setEnabled(true);
		LBLcounter.reset();
		BTNflag.setUnPressed();
		LBLwin.remove();
		BTNnew.setEnabled(true);
	}
}