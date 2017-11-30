import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Mountains extends Applet{
	public void paint(Graphics g) {
		draw_close_mountains(g);	
	}
	public static void
	draw_close_mountains(Graphics g) {
	
	Polygon closemountain = new Polygon();//creates a polygon
	closemountain.addPoint(0,154);closemountain.addPoint(81, 148); closemountain.addPoint(153, 222); closemountain.addPoint(175, 288);closemountain.addPoint(216, 273);closemountain.addPoint(270, 277);closemountain.addPoint(405, 334);closemountain.addPoint(418, 376);closemountain.addPoint(516, 409);closemountain.addPoint(588, 672);closemountain.addPoint(0, 676);//adds all the points for a polygon
	
	g.setColor(Color.GRAY);//makes polygon line green
	
	g.fillPolygon(closemountain);//draws polygon
	}
}
		
		
		
		
		


