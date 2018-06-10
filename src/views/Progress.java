package views;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Progress extends JFrame {
	private static final long serialVersionUID = 1L;
	private static JProgressBar prg;
	public Progress() {
		this.setBounds(500, 500, 160, 30);
		this.setContentPane(new JPanel());
		prg = new JProgressBar();
		prg.setValue(67);
		prg.setStringPainted(true);
		prg.setForeground(Color.blue);
		this.add(prg);
		this.setUndecorated(true);
		this.setVisible(true);
	}

}
