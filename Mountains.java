import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Mountains extends Applet{
	public void paint(Graphics g) {
		draw_far_mountains(g);
		draw_grass_fm(g);
		draw_close_mountains(g);
		draw_grass_cm(g);
		
	}
	public static void
	draw_close_mountains(Graphics g) {
	
	Polygon closemountain = new Polygon();//creates a polygon
	closemountain.addPoint(0,154);closemountain.addPoint(81, 148); closemountain.addPoint(153, 222); closemountain.addPoint(175, 288);closemountain.addPoint(216, 273);closemountain.addPoint(270, 277);closemountain.addPoint(405, 334);closemountain.addPoint(418, 376);closemountain.addPoint(516, 409);closemountain.addPoint(588, 672);closemountain.addPoint(0, 676);//adds all the points for a polygon
	g.setColor(Color.GRAY);//makes polygon line green
	g.fillPolygon(closemountain);}//draws polygon
	
	public static void
	draw_grass_cm(Graphics g) {
	
		for(int k = 0; k < 500000; k++) {
			int randx = (int)(Math.random()*1000);
			int randy = (int)(Math.random()*1000);			
			int R = (int) Math.round(Math.random()*15)+10;//Converts random number to integer so can be used by rgb values
			int B = 0;
			int G = (int) Math.round(Math.random()*115);//Converts random number to integer so can be used by rgb values
			
			
			
			Polygon closemountain = new Polygon();//creates a polygon
			closemountain.addPoint(0,154);closemountain.addPoint(81, 148); closemountain.addPoint(153, 222); closemountain.addPoint(175, 288);closemountain.addPoint(216, 273);closemountain.addPoint(270, 277);closemountain.addPoint(405, 334);closemountain.addPoint(418, 376);closemountain.addPoint(516, 409);closemountain.addPoint(588, 672);closemountain.addPoint(0, 676);//adds all the points for a polygon
			if(closemountain.contains(randx, randy)) {
				g.setColor(new Color(R,G,B));
				g.fillRect(randx, randy, 2, 2);}}}
		
	public static void
	draw_grass_fm(Graphics g){
	
		for(int k = 0; k < 500000; k++) {
			int randx = (int)(Math.random()*1000);
			int randy = (int)(Math.random()*1000);
			int R = (int) Math.round(Math.random()*35)+120;//Converts random number to integer so can be used by rgb values
			int B = (int) Math.round(Math.random()*35)+120;
			int G = (int) Math.round(Math.random()*35)+120;//Converts random number to integer so can be used by rgb values
			
			Polygon farmountains = new Polygon();
			farmountains.addPoint(328, 295);farmountains.addPoint(364, 296);farmountains.addPoint(398, 294);farmountains.addPoint(413, 306);farmountains.addPoint(466, 322);farmountains.addPoint(498, 338);farmountains.addPoint(542, 360);farmountains.addPoint(608, 376);farmountains.addPoint(607, 376);farmountains.addPoint(939, 393);farmountains.addPoint(939, 637);farmountains.addPoint(637, 637);farmountains.addPoint(296,637);
			if(farmountains.contains(randx,randy)) {
				g.setColor(new Color(R,G,B));
				g.fillRect(randx, randy, 2, 2);
		}
		}}
	
	
	public static void
	draw_far_mountains(Graphics g) {
	Polygon farmountains = new Polygon();
	farmountains.addPoint(328, 295);farmountains.addPoint(364, 296);farmountains.addPoint(398, 294);farmountains.addPoint(413, 306);farmountains.addPoint(466, 322);farmountains.addPoint(498, 338);farmountains.addPoint(542, 360);farmountains.addPoint(608, 376);farmountains.addPoint(607, 376);farmountains.addPoint(939, 393);farmountains.addPoint(939, 637);farmountains.addPoint(637, 637);farmountains.addPoint(296,637);
	g.setColor(new Color(200,200,200));
	g.fillPolygon(farmountains);

	}
}

		
		
		
		
		


