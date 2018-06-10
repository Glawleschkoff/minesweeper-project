package common;

public class Element {
	private boolean bomb;
	private boolean cover;
	private int number;
	Element(){
		bomb = false;
		cover = true;
		number = 0;
	}
	public boolean getBomb() {
		return bomb;
	}
	public void setBomb() {
		bomb = true;
		number = -1;
	}
	public boolean getCover() {
		return cover;
	}
	public void deleteBomb() {
		bomb = false;
	}
	public void setNumber() {
		if(bomb==false) {
			number+=1;
		}
	}
	public int getNumber() {
		return number;
	}
	public void resetNumber() {
		number=0;
	}
	public boolean getBoolNumber() {
		if(number==0) {
			return true;
		} else {
			return false;
		}
	}
}