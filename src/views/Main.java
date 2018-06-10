package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import common.ArrayElement;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	private static ArrayElement field;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Main() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(200, 200, 296, 693);
		setTitle("Bombenjagd");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		new BTNflag(contentPane);
		new BTNnew(contentPane);
		field = new ArrayElement(1);
		new ArrayField(contentPane);	
		new LBLcounter(contentPane);
//		new Progress();
		
	}
	public static void setFeld() {
		field = new ArrayElement(field.getL());
	}
	public static JPanel getJPanel() {
		return contentPane;
	}
}