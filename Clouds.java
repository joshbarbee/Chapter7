import java.awt.Color;
import java.awt.Graphics;

public class Clouds {
	public static void
	drawClouds(Graphics g) {
		for(int k = 0; k < 7; k++) {
			int skyx = (int)Math.round(Math.random() *950);
			int skyy = (int)Math.round(Math.random() * 100);
			int skywidth= (int)Math.round(Math.random() * 50 + 100);
			int skylength = (int)Math.round(Math.random() * 50+10);
			
			int R = (int) Math.round(Math.random()*10)+245;//Converts random number to integer so can be used by rgb values
			int B = (int) Math.round(Math.random()*10)+245;//Converts random number to integer so can be used by rgb values
			int G = (int) Math.round(Math.random()*10)+245;//Converts random number to integer so can be used by rgb values	
			
			g.setColor(new Color(R,G,B));
			g.fillOval(skyx-50, skyy, skywidth, skylength);}
}}
