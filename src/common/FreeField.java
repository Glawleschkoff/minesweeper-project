package common;

import java.util.ArrayList;

public class FreeField {
	
	private static ArrayList <Integer> storage = new ArrayList <Integer>();
	
	public static ArrayList<Integer> getFreeList(int i){
		int v = 0;
		int w = 1;
		storage.add(i);
		while(v!=w) {
			w = storage.size();
			for(int j=0; j<storage.size(); j++) {
				setAround(storage.get(j));
			}
			v = storage.size();
		}
		setAround2();
		return storage;
	}
	public static void setAround2() {
		ArrayList <Integer> secstorage = new ArrayList <Integer>();
		for(int m=0; m<storage.size(); m++) {
			int i = storage.get(m);
			if(i>=11&&i<=18 | i>=21&&i<=28 | i>=31&&i<=38 | i>=41&&i<=48 | i>=51&&i<=58 | i>=61&&i<=68 | i>=71&&i<=78 | i>=81&&i<=88 | i>=91&&i<=98 | i>=101&&i<=108 | i>=111&&i<=118 | i>=121&&i<=128 | i>=131&&i<=138 | i>=141&&i<=148 | i>=151&&i<=158 | i>=161&&i<=168 | i>=171&&i<=178 | i>=181&&i<=188){
				if(!storage.contains(i-11)&!secstorage.contains(i-11)) secstorage.add(i-11);
				if(!storage.contains(i-10)&!secstorage.contains(i-10)) secstorage.add(i-10);
				if(!storage.contains(i-9)&!secstorage.contains(i-9)) secstorage.add(i-9);
				if(!storage.contains(i-1)&!secstorage.contains(i-1)) secstorage.add(i-1);
				if(!storage.contains(i+11)&!secstorage.contains(i+11)) secstorage.add(i+11);
				if(!storage.contains(i+10)&!secstorage.contains(i+10)) secstorage.add(i+10);
				if(!storage.contains(i+9)&!secstorage.contains(i+9)) secstorage.add(i+9);
				if(!storage.contains(i+1)&!secstorage.contains(i+1)) secstorage.add(i+1);
			} else if(i>=1&&i<=8) {
				if(!storage.contains(i-1)&!secstorage.contains(i-1)) secstorage.add(i-1);
				if(!storage.contains(i+1)&!secstorage.contains(i+1)) secstorage.add(i+1);
				if(!storage.contains(i+11)&!secstorage.contains(i+11)) secstorage.add(i+11);
				if(!storage.contains(i+10)&!secstorage.contains(i+10)) secstorage.add(i+10);
				if(!storage.contains(i+9)&!secstorage.contains(i+9)) secstorage.add(i+9);
			} else if(i>=191&&i<=198) {
				if(!storage.contains(i-1)&!secstorage.contains(i-1)) secstorage.add(i-1);
				if(!storage.contains(i+1)&!secstorage.contains(i+1)) secstorage.add(i+1);
				if(!storage.contains(i-9)&!secstorage.contains(i-9)) secstorage.add(i-9);
				if(!storage.contains(i-10)&!secstorage.contains(i-10)) secstorage.add(i-10);
				if(!storage.contains(i-11)&!secstorage.contains(i-11)) secstorage.add(i-11);
			} else if(i==0) {
				if(!storage.contains(i+1)&!secstorage.contains(i+1)) secstorage.add(i+1);
				if(!storage.contains(i+10)&!secstorage.contains(i+10)) secstorage.add(i+10);
				if(!storage.contains(i+11)&!secstorage.contains(i+11)) secstorage.add(i+11);
			} else if(i==9) {
				if(!storage.contains(i-1)&!secstorage.contains(i-1)) secstorage.add(i-1);
				if(!storage.contains(i+9)&!secstorage.contains(i+9)) secstorage.add(i+9);
				if(!storage.contains(i+10)&!secstorage.contains(i+10)) secstorage.add(i+10);
			} else if(i==190) {
				if(!storage.contains(i-10)&!secstorage.contains(i-10)) secstorage.add(i-10);
				if(!storage.contains(i-9)&!secstorage.contains(i-9)) secstorage.add(i-9);
				if(!storage.contains(i+1)&!secstorage.contains(i+1)) secstorage.add(i+1);
			} else if(i==199) {
				if(!storage.contains(i-1)&!secstorage.contains(i-1)) secstorage.add(i-1);
				if(!storage.contains(i-10)&!secstorage.contains(i-10)) secstorage.add(i-10);
				if(!storage.contains(i-11)&!secstorage.contains(i-11)) secstorage.add(i-11);
			} else if(i==10|i==20|i==30|i==40|i==50|i==60|i==70|i==80|i==90|i==100|i==110|i==120|i==130|i==140|i==150|i==160|i==170|i==180) {
				if(!storage.contains(i-10)&!secstorage.contains(i-10)) secstorage.add(i-10);
				if(!storage.contains(i-9)&!secstorage.contains(i-9)) secstorage.add(i-9);
				if(!storage.contains(i+1)&!secstorage.contains(i+1)) secstorage.add(i+1);
				if(!storage.contains(i+10)&!secstorage.contains(i+10)) secstorage.add(i+10);
				if(!storage.contains(i+11)&!secstorage.contains(i+11)) secstorage.add(i+11);
			} else if(i==19|i==29|i==39|i==49|i==59|i==69|i==79|i==89|i==99|i==109|i==119|i==129|i==139|i==149|i==159|i==169|i==179|i==189) {
				if(!storage.contains(i-11)&!secstorage.contains(i-11)) secstorage.add(i-11);
				if(!storage.contains(i-10)&!secstorage.contains(i-10)) secstorage.add(i-10);
				if(!storage.contains(i-1)&!secstorage.contains(i-1)) secstorage.add(i-1);
				if(!storage.contains(i+9)&!secstorage.contains(i+9)) secstorage.add(i+9);
				if(!storage.contains(i+10)&!secstorage.contains(i+10)) secstorage.add(i+10);
			}
		}
		for(int j=0; j<secstorage.size(); j++) {
			storage.add(secstorage.get(j));
		}
	}
	public static void setAround(int i) {
		if(i>=11&&i<=18 | i>=21&&i<=28 | i>=31&&i<=38 | i>=41&&i<=48 | i>=51&&i<=58 | i>=61&&i<=68 | i>=71&&i<=78 | i>=81&&i<=88 | i>=91&&i<=98 | i>=101&&i<=108 | i>=111&&i<=118 | i>=121&&i<=128 | i>=131&&i<=138 | i>=141&&i<=148 | i>=151&&i<=158 | i>=161&&i<=168 | i>=171&&i<=178 | i>=181&&i<=188){
			if(ArrayElement.getFeld().get(i-11).getBoolNumber()) if(!storage.contains(i-11)) storage.add(i-11);
			if(ArrayElement.getFeld().get(i-10).getBoolNumber()) if(!storage.contains(i-10)) storage.add(i-10);
			if(ArrayElement.getFeld().get(i-9).getBoolNumber()) if(!storage.contains(i-9)) storage.add(i-9);
			if(ArrayElement.getFeld().get(i-1).getBoolNumber()) if(!storage.contains(i-1)) storage.add(i-1);
			if(ArrayElement.getFeld().get(i+11).getBoolNumber()) if(!storage.contains(i+11)) storage.add(i+11);
			if(ArrayElement.getFeld().get(i+10).getBoolNumber()) if(!storage.contains(i+10)) storage.add(i+10);
			if(ArrayElement.getFeld().get(i+9).getBoolNumber()) if(!storage.contains(i+9)) storage.add(i+9);
			if(ArrayElement.getFeld().get(i+1).getBoolNumber()) if(!storage.contains(i+1)) storage.add(i+1);
		} else if(i>=1&&i<=8) {
			if(ArrayElement.getFeld().get(i-1).getBoolNumber()) if(!storage.contains(i-1)) storage.add(i-1);
			if(ArrayElement.getFeld().get(i+1).getBoolNumber()) if(!storage.contains(i+1)) storage.add(i+1);
			if(ArrayElement.getFeld().get(i+11).getBoolNumber()) if(!storage.contains(i+11)) storage.add(i+11);
			if(ArrayElement.getFeld().get(i+10).getBoolNumber()) if(!storage.contains(i+10)) storage.add(i+10);
			if(ArrayElement.getFeld().get(i+9).getBoolNumber()) if(!storage.contains(i+9)) storage.add(i+9);
		} else if(i>=191&&i<=198) {
			if(ArrayElement.getFeld().get(i-1).getBoolNumber()) if(!storage.contains(i-1)) storage.add(i-1);
			if(ArrayElement.getFeld().get(i+1).getBoolNumber()) if(!storage.contains(i+1)) storage.add(i+1);
			if(ArrayElement.getFeld().get(i-9).getBoolNumber()) if(!storage.contains(i-9)) storage.add(i-9);
			if(ArrayElement.getFeld().get(i-10).getBoolNumber()) if(!storage.contains(i-10)) storage.add(i-10);
			if(ArrayElement.getFeld().get(i-11).getBoolNumber()) if(!storage.contains(i-11)) storage.add(i-11);
		} else if(i==0) {
			if(ArrayElement.getFeld().get(i+1).getBoolNumber()) if(!storage.contains(i+1)) storage.add(i+1);
			if(ArrayElement.getFeld().get(i+10).getBoolNumber()) if(!storage.contains(i+10)) storage.add(i+10);
			if(ArrayElement.getFeld().get(i+11).getBoolNumber()) if(!storage.contains(i+11)) storage.add(i+11);
		} else if(i==9) {
			if(ArrayElement.getFeld().get(i-1).getBoolNumber()) if(!storage.contains(i-1)) storage.add(i-1);
			if(ArrayElement.getFeld().get(i+9).getBoolNumber()) if(!storage.contains(i+9)) storage.add(i+9);
			if(ArrayElement.getFeld().get(i+10).getBoolNumber()) if(!storage.contains(i+10)) storage.add(i+10);
		} else if(i==190) {
			if(ArrayElement.getFeld().get(i-10).getBoolNumber()) if(!storage.contains(i-10)) storage.add(i-10);
			if(ArrayElement.getFeld().get(i-9).getBoolNumber()) if(!storage.contains(i-9)) storage.add(i-9);
			if(ArrayElement.getFeld().get(i+1).getBoolNumber()) if(!storage.contains(i+1)) storage.add(i+1);
		} else if(i==199) {
			if(ArrayElement.getFeld().get(i-1).getBoolNumber()) if(!storage.contains(i-1)) storage.add(i-1);
			if(ArrayElement.getFeld().get(i-10).getBoolNumber()) if(!storage.contains(i-10)) storage.add(i-10);
			if(ArrayElement.getFeld().get(i-11).getBoolNumber()) if(!storage.contains(i-11)) storage.add(i-11);
		} else if(i==10|i==20|i==30|i==40|i==50|i==60|i==70|i==80|i==90|i==100|i==110|i==120|i==130|i==140|i==150|i==160|i==170|i==180) {
			if(ArrayElement.getFeld().get(i-10).getBoolNumber()) if(!storage.contains(i-10)) storage.add(i-10);
			if(ArrayElement.getFeld().get(i-9).getBoolNumber()) if(!storage.contains(i-9)) storage.add(i-9);
			if(ArrayElement.getFeld().get(i+1).getBoolNumber()) if(!storage.contains(i+1)) storage.add(i+1);
			if(ArrayElement.getFeld().get(i+10).getBoolNumber()) if(!storage.contains(i+10)) storage.add(i+10);
			if(ArrayElement.getFeld().get(i+11).getBoolNumber()) if(!storage.contains(i+11)) storage.add(i+11);
		} else if(i==19|i==29|i==39|i==49|i==59|i==69|i==79|i==89|i==99|i==109|i==119|i==129|i==139|i==149|i==159|i==169|i==179|i==189) {
			if(ArrayElement.getFeld().get(i-11).getBoolNumber()) if(!storage.contains(i-11)) storage.add(i-11);
			if(ArrayElement.getFeld().get(i-10).getBoolNumber()) if(!storage.contains(i-10)) storage.add(i-10);
			if(ArrayElement.getFeld().get(i-1).getBoolNumber()) if(!storage.contains(i-1)) storage.add(i-1);
			if(ArrayElement.getFeld().get(i+9).getBoolNumber()) if(!storage.contains(i+9)) storage.add(i+9);
			if(ArrayElement.getFeld().get(i+10).getBoolNumber()) if(!storage.contains(i+10)) storage.add(i+10);
		}
	}
	public static void clearStorage() {
		storage.clear();
	}
}
