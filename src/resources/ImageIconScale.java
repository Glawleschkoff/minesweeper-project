package resources;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class ImageIconScale {
	private URL resource;
	private ImageIcon ico; 
	public ImageIconScale(String s, int x) {
			if(s=="fahne") {
				resource = ImageIconScale.class.getResource("./fahne.png");
				ico = new ImageIcon(resource);
				ico.setImage(ico.getImage().getScaledInstance(x,x,Image.SCALE_DEFAULT));
			} else if(s=="neu") {
				resource = ImageIconScale.class.getResource("./neu.png");
				ico = new ImageIcon(resource);
				ico.setImage(ico.getImage().getScaledInstance(x,x,Image.SCALE_DEFAULT));
			} else if (s=="bombe") {
				resource = ImageIconScale.class.getResource("./bombe.png");
				ico = new ImageIcon(resource);
				ico.setImage(ico.getImage());
			}
	}
	public ImageIcon getImage() {
		return ico;
	}	
}