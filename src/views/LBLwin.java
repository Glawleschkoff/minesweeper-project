package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LBLwin {
	private static JLabel txtWin = new JLabel();
	public LBLwin(JPanel panel) {
		panel.add(txtWin);
		txtWin.setVisible(false);
		txtWin.setFont(new Font("Arial", Font.ITALIC, 44));
		txtWin.setText("<html>Du hast <p/> "+                  
                "erfolgreich <p/> "+
				"GEWONNEN! </html>");
		txtWin.setBounds(0, 100, 400, 400);
		txtWin.setForeground(Color.green);
	}
	public static void add() {
		txtWin.repaint();
		txtWin.setVisible(true);
	}
	public static void remove() {
		txtWin.setVisible(false);
	}
}
