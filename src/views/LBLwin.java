package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LBLwin {
	private static JLabel txtWin = new JLabel();
	public LBLwin(JLayeredPane panel) {
		panel.add(txtWin,0);
		txtWin.setVisible(false);
		txtWin.setFont(new Font("Arial", Font.BOLD, 44));
		txtWin.setText("<html>Du hast <p/> "+                  
                "erfolgreich <p/> "+
				"GEWONNEN! </html>");
		txtWin.setBounds(0, 100, 400, 400);
		txtWin.setForeground(Color.BLUE);
	}
	public static void add() {
		txtWin.repaint();
		txtWin.setVisible(true);
	}
	public static void remove() {
		txtWin.setVisible(false);
	}
}