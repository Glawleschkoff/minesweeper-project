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
		setBounds(200, 200, 296, 658);
		setTitle("Bombenjagd");
		setResizable(false); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		new BTNflag(contentPane);
		new BTNnew(contentPane);
		new BTNlevel(contentPane);
		new ArrayElement(1);
		new ArrayField(contentPane);	
		new LBLcounter(contentPane);
		new LBLwin(contentPane);
	}
	public static void setFeld() {
		new ArrayElement(BTNlevel.getNum());
	}
	public static JPanel getJPanel() {
		return contentPane;
	}
}