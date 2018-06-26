package views;

import java.util.ArrayList;

import javax.swing.JPanel;

import common.ArrayElement;

public class ArrayField {
	private static ArrayList<BTNfield> list = new ArrayList<BTNfield>(200);
	public ArrayField(JPanel panel) {
		for(int i = 0; i<200; i++) {
			for(int a = 60; a<640; a = a+28) {
				for(int b = 0; b<280; b = b+28) {
					list.add(new BTNfield(b,a,29,29));
					panel.add(list.get(i).getButton());
					if(ArrayElement.getBomb(i)==true) {
						panel.add(list.get(i).getBlabel());
					}
					if(ArrayElement.getFeld().get(i).getNumber()!=0) {
						panel.add(list.get(i).getNlabel(i));
					}
				}
			}
		}
	}
	public static ArrayList<BTNfield> getList() {
		return list;
	}
	public static void reset(JPanel panel) {
		for(int i = 0; i<200; i++) {
			panel.remove(list.get(i).getBlabel());
			panel.remove(list.get(i).getButton());
			panel.remove(list.get(i).getNlabel());
			panel.repaint();
		}
	}
	public static void clear() {
		list.clear();
	}
	
	public static void neu(JPanel panel) {
		int i = 0;
		for(int a = 60; a<640; a = a+28) {
			for(int b = 0; b<280; b = b+28) {
				if (i<200) {
					list.add(new BTNfield(b,a,29,29));
					panel.add(list.get(i).getButton());
					if(ArrayElement.getBomb(i)==true) {
						panel.add(list.get(i).getBlabel());
					}
					if(ArrayElement.getFeld().get(i).getNumber()!=0) {
						panel.add(list.get(i).getNlabel(i));
					}
					i++;
				}
			}
		}
	}	
	public static void initNumber() {
		for(int i=0; i<200; i++) {
			Main.getJPanel().remove(list.get(i).getNlabel(i));
		}
		for(int i=0; i<200; i++) {
			if(ArrayElement.getFeld().get(i).getNumber()!=0) {
				Main.getJPanel().add(list.get(i).getNlabel(i));
			}
		}
	}
	public static boolean getRemain() {
		int i = 200-ArrayElement.getY();
		int x = 0;
		for(BTNfield y : list) {
			if(!y.getButton().isVisible()) {
				x++;
			}
		}
		if(i-x == 0) {
			x = 0;
			return true;
		} else {
			x = 0;
			return false;
		}
	}
}
