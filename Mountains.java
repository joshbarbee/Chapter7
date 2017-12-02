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
		draw_stones(g);
		draw_grass_cm(g);
		
	}
	public static void
	draw_close_mountains(Graphics g) {
	
	Polygon closemountain = new Polygon();//creates a polygon
	closemountain.addPoint(0,154);closemountain.addPoint(81, 148); closemountain.addPoint(153, 222); closemountain.addPoint(175, 288);closemountain.addPoint(216, 273);closemountain.addPoint(270, 277);closemountain.addPoint(405, 334);closemountain.addPoint(418, 376);closemountain.addPoint(516, 409);closemountain.addPoint(588, 672);closemountain.addPoint(0, 676);closemountain.addPoint(3, 530);closemountain.addPoint(271, 420);closemountain.addPoint(288, 409);closemountain.addPoint(332, 403);closemountain.addPoint(352, 410);closemountain.addPoint(403, 456);closemountain.addPoint(444, 445);closemountain.addPoint(449, 415);closemountain.addPoint(422, 408);closemountain.addPoint(350, 394);closemountain.addPoint(270, 391);closemountain.addPoint(259, 393);closemountain.addPoint(90, 404);closemountain.addPoint(31, 408);closemountain.addPoint(0, 420);//adds all the points for a polygon
	g.setColor(Color.GRAY);//makes polygon line green
	g.fillPolygon(closemountain);
	}
	public static void
	draw_stones(Graphics g) {
	Polygon stones = new Polygon();
	stones.addPoint(0, 390);stones.addPoint(450, 390);stones.addPoint(450, 540);stones.addPoint(0, 540);
	
	g.setColor(new Color(160,160,149));
	g.fillPolygon(stones);
		for(int k = 0; k <1200; k++) {
			int randx = (int)(Math.random()*450);
			int randy = (int)(Math.random()*540);
			if(stones.contains(randx, randy)) {
				g.setColor(new Color(155,155,155));
				g.fillRect(randx-60, randy-5, 60, 5);}
		for(int a = 0; a <600; a++) {
				int randx2 = (int)(Math.random()*450);
				int randy2 = (int)(Math.random()*540);	
			if(stones.contains(randx2, randy2)) {
				g.setColor(new Color(136,132,95));
				g.drawLine(randx2, randy2, randx2, randy2);
			}
	}}}
	public static void
	draw_grass_cm(Graphics g) {
	
		for(int k = 0; k < 500000; k++) {
			int randx = (int)(Math.random()*1000);
			int randy = (int)(Math.random()*1000);			
			int R = (int) Math.round(Math.random()*15)+10;//Converts random number to integer so can be used by rgb values
			int B = 0;
			int G = (int) Math.round(Math.random()*115);//Converts random number to integer so can be used by rgb values

			
			Polygon closemountain = new Polygon();//creates a polygon
			closemountain.addPoint(0,154);closemountain.addPoint(81, 148); closemountain.addPoint(153, 222); closemountain.addPoint(175, 288);closemountain.addPoint(216, 273);closemountain.addPoint(270, 277);closemountain.addPoint(405, 334);closemountain.addPoint(418, 376);closemountain.addPoint(516, 409);closemountain.addPoint(588, 672);closemountain.addPoint(0, 676);closemountain.addPoint(0, 530);closemountain.addPoint(271, 420);closemountain.addPoint(288, 409);closemountain.addPoint(332, 403);closemountain.addPoint(352, 410);closemountain.addPoint(403, 456);closemountain.addPoint(444, 445);closemountain.addPoint(449, 415);closemountain.addPoint(422, 408);closemountain.addPoint(350, 394);closemountain.addPoint(270, 391);closemountain.addPoint(259, 393);closemountain.addPoint(90, 404);closemountain.addPoint(31, 408);closemountain.addPoint(0, 420);//adds all the points for a polygon
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

		
		
		
		
		


