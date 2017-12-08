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
		int R = 13;
		int G = 87;
		int B = 200;
		for(int k = 0; k < 200; k++)
		{
		
		int x1 = 0;
		int y1 = 0;
		int y2 = 0;
		int x2 = 950;
		
		g.setColor(new Color(R,G,B));
		g.drawLine(y1,x1,1000,1300);
		y1++;
		y2++;
				
		}	

		}
	public static void
	drawClouds(Graphics g) {
		for(int k = 0; k < 8; k++) {
			int skyx = (int)Math.round(Math.random() *950);
			int skyy = (int)Math.round(Math.random() * 100);
			int skywidth= (int)Math.round(Math.random() * 50 + 150);
			int skylength = (int)Math.round(Math.random() * 50 +10);
			
			int R = (int) Math.round(Math.random()*15)+230;//Converts random number to integer so can be used by rgb values
			int B = (int) Math.round(Math.random()*15)+230;//Converts random number to integer so can be used by rgb values
			int G = (int) Math.round(Math.random()*15)+230;//Converts random number to integer so can be used by rgb values	
			
			g.setColor(new Color(R,G,B));
			g.fillOval(skyx-100, skyy+10, skywidth, skylength);}
	}	
	}

