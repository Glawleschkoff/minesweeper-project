package views;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLayeredPane;

public class BTNlevel {
	private JButton btnLevel = new JButton("Novize");
	private static int num = 1;
	private String name;
	public BTNlevel(JLayeredPane panel) {
		panel.add(btnLevel);
		btnLevel.setBounds(117, 29, 164, 31);
		btnLevel.setFont(new Font("Arial", Font.ITALIC, 20));
		
		btnLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(BTNfield.getStart()==false | BTNfield.getEnd()) {
					high();
					btnLevel.setText(name);
					BTNnew.neu();
				} else {
					high();
					btnLevel.setText(name);
					BTNnew.setEnabled(true);
				}
				
				
			}
		});
	}
	private void high() {
		if(num==1) {
			num++;
			name = "Adept";
		} else if(num==2) {
			num++;
			name = "Experte";
		} else {
			num = 1;
			name = "Novize";
		}
	}
	public static int getNum() {
		return num;
	}

}
