package common;

import java.util.ArrayList;

public class ArrayElement {
	private static ArrayList<Element> list = new ArrayList<Element>(200);
	private int x;
	private static int y;
	public ArrayElement(int l){
		x=l;
		for(int i=0; i<200; i++) {
			list.add(new Element());
		}
		int x;
		switch(l) {
			case 1: x = 20;
					y = 20;
			break;
			case 2: x = 50;
					y = 50;
			break;
			case 3: x = 80;
					y = 80;	
			break;
			case 4: x = 1;
					y = 1;
			break;
			default: x=200;
					 y=200;
		}
		for(int i=0; i<x; i++) {
			int v = (int)(Math.random()*200);
			if(!list.get(v).getBomb()) {
				list.get(v).setBomb();
			} else {
				i--;
			}
		}
		initNumber();
	}
	public static boolean getBomb(int i) {
		return list.get(i).getBomb();
	}
	public int getL() {
		return x;
	}
	public static ArrayList<Element> getFeld() {
		return list;
	}
	public static int getY() {
		return y;
	}
	public static void initNumber() {
		for(int i=0; i<200; i++) {
			if(list.get(i).getBomb()) {
				if(i>=11&&i<=18 | i>=21&&i<=28 | i>=31&&i<=38 | i>=41&&i<=48 | i>=51&&i<=58 | i>=61&&i<=68 | i>=71&&i<=78 | i>=81&&i<=88 | i>=91&&i<=98 | i>=101&&i<=108 | i>=111&&i<=118 | i>=121&&i<=128 | i>=131&&i<=138 | i>=141&&i<=148 | i>=151&&i<=158 | i>=161&&i<=168 | i>=171&&i<=178 | i>=181&&i<=188){
					list.get(i-11).setNumber();
					list.get(i-10).setNumber();
					list.get(i-9).setNumber();
					list.get(i-1).setNumber();
					list.get(i+11).setNumber();
					list.get(i+10).setNumber();
					list.get(i+9).setNumber();
					list.get(i+1).setNumber();
				} else if(i>=1&&i<=8) {
					list.get(i-1).setNumber();
					list.get(i+1).setNumber();
					list.get(i+11).setNumber();
					list.get(i+10).setNumber();
					list.get(i+9).setNumber();
				} else if(i>=191&&i<=198) {
					list.get(i-1).setNumber();
					list.get(i+1).setNumber();
					list.get(i-9).setNumber();
					list.get(i-10).setNumber();
					list.get(i-11).setNumber();
				} else if(i==0) {
					list.get(i+1).setNumber();
					list.get(i+10).setNumber();
					list.get(i+11).setNumber();
				} else if(i==9) {
					list.get(i-1).setNumber();
					list.get(i+9).setNumber();
					list.get(i+10).setNumber();
				} else if(i==190) {
					list.get(i-10).setNumber();
					list.get(i-9).setNumber();
					list.get(i+1).setNumber();
				} else if(i==199) {
					list.get(i-1).setNumber();
					list.get(i-10).setNumber();
					list.get(i-11).setNumber();
				} else if(i==10|i==20|i==30|i==40|i==50|i==60|i==70|i==80|i==90|i==100|i==110|i==120|i==130|i==140|i==150|i==160|i==170|i==180) {
					list.get(i-10).setNumber();
					list.get(i-9).setNumber();
					list.get(i+1).setNumber();
					list.get(i+10).setNumber();
					list.get(i+11).setNumber();
				} else if(i==19|i==29|i==39|i==49|i==59|i==69|i==79|i==89|i==99|i==109|i==119|i==129|i==139|i==149|i==159|i==169|i==179|i==189) {
					list.get(i-11).setNumber();
					list.get(i-10).setNumber();
					list.get(i-1).setNumber();
					list.get(i+9).setNumber();
					list.get(i+10).setNumber();
				}
			}
			
		}
	}
	public static void resetNumber() {
		for(int i=0; i<200; i++) {
			list.get(i).resetNumber();
		}
	}
}
