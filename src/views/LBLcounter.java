package views;

import javax.swing.JLabel;
import javax.swing.JPanel;

import common.ArrayElement;

public class LBLcounter {
	
	private static JLabel lblCounter = new JLabel();
	private static int counter = ArrayElement.getY();
	
	public LBLcounter(JPanel panel) {
		lblCounter.setBounds(118, 0, 118, 30);
		panel.add(lblCounter);
		lblCounter.setText(String.valueOf("Bomben: " + counter));
	}
	public static void setCounter(int i) {
		counter = counter+i;
		lblCounter.setText(String.valueOf("Bomben: " + counter));
	}
	public static void reset() {
		counter = ArrayElement.getY();
		lblCounter.setText(String.valueOf("Bomben: " + counter));
	}

}
