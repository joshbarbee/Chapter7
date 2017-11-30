import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.math.*;
public class Clouds extends Applet{
	public void paint(Graphics g)
	{
		drawSky(g);
		drawClouds(g);
	}
	public static void
	drawSky(Graphics g){
		g.setColor(new Color(13,95,223));
		g.fillRect(0, 0, 1000, 800);}
	public static void
	drawClouds(Graphics g) {
		for(int k = 0; k < 15; k++) {
			int skyx = (int)Math.round(Math.random() *950);
			int skyy = (int)Math.round(Math.random() * 100);
			int skywidth= (int)Math.round(Math.random() * 50 + 50);
			int skylength = (int)Math.round(Math.random() * 50 + 50);
			
			int R = (int) Math.round(Math.random()*15)+230;//Converts random number to integer so can be used by rgb values
			int B = (int) Math.round(Math.random()*15)+230;//Converts random number to integer so can be used by rgb values
			int G = (int) Math.round(Math.random()*15)+230;//Converts random number to integer so can be used by rgb values	
			
			g.setColor(new Color(R,G,B));
			g.fillOval(skyx, skyy, skywidth, skylength);}
	}	
	}

