package views;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import common.ArrayElement;

public class LBLcounter {
	
	private static JLabel lblCounter = new JLabel();
	private static int counter = ArrayElement.getY();
	
	public LBLcounter(JLayeredPane panel) {
		lblCounter.setBounds(145, 0, 118, 30);
		lblCounter.setFont(new Font("Arial", Font.BOLD, 20));
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
	public static int getCounter() {
		return counter;
	}

}