import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Buildings extends Applet{
	public void paint(Graphics g) {
		draw_buildings(g);
		
		draw_stones(g);
		draw_outlines(g);
		
	}
	public static void
	draw_buildings(Graphics g)
	{
		Polygon building = new Polygon();
			building.addPoint(0, 679);
			building.addPoint(0, 535);
			building.addPoint(24, 531);
			building.addPoint(35, 509);
			building.addPoint(25, 501);
			building.addPoint(157, 309);
			building.addPoint(183, 290);
			building.addPoint(221, 303);
			building.addPoint(303, 496);
			building.addPoint(332, 484);
			building.addPoint(470, 473);
			building.addPoint(613, 465);
			building.addPoint(619, 424);
			building.addPoint(597, 419);
			building.addPoint(700, 76);
			building.addPoint(800, 35);
			building.addPoint(840, 66);
			building.addPoint(981, 430);
			building.addPoint(1023, 623);
			building.addPoint(1025, 681);
			building.addPoint(476, 681);
			building.addPoint(345, 660);
			building.addPoint(349, 680);
			building.addPoint(160, 680);
			building.addPoint(157, 666);
			building.addPoint(80, 680);
		g.setColor(Color.LIGHT_GRAY);
		g.fillPolygon(building);}
	public static void
	draw_stones(Graphics g) {
		Polygon building = new Polygon();
			building.addPoint(0, 679);
			building.addPoint(3, 535);
			building.addPoint(24, 531);
			building.addPoint(35, 509);
			building.addPoint(25, 501);
			building.addPoint(157, 309);
			building.addPoint(183, 290);
			building.addPoint(221, 303);
			building.addPoint(303, 496);
			building.addPoint(332, 484);
			building.addPoint(470, 473);
			building.addPoint(613, 465);
			building.addPoint(619, 424);
			building.addPoint(597, 419);
			building.addPoint(700, 76);
			building.addPoint(800, 35);
			building.addPoint(840, 66);
			building.addPoint(981, 430);
			building.addPoint(1023, 623);
			building.addPoint(1025, 681);
			building.addPoint(476, 681);
			building.addPoint(345, 660);
			building.addPoint(349, 680);
			building.addPoint(160, 680);
			building.addPoint(157, 666);
			building.addPoint(80, 680);
		for(int k = 0; k < 8000; k++) {
			int randx = (int)(Math.random()*1000);
			int randy = (int)(Math.random()*700); 	
			int randwidth = (int)(Math.random()*10+30);
			int randheight = (int)(Math.random()*10);
					
			int R = (int) Math.round(Math.random()*10)+120;
			int B = (int) Math.round(Math.random()*10)+120;
			int G = (int) Math.round(Math.random()*10+120);
			if(building.contains(randx, randy, randwidth, randheight)) {

				g.setColor(new Color(R,G,B));
				g.fillRect(randx, randy, 30, 10);
				
			
		}}
	
	}
	public static void
	draw_outlines(Graphics g) {
		/*For fg rect
		g.setColor(Color.BLACK);
		g.drawRect(157, 523, 191, 300);
		g.setColor(new Color(139,69,19,30));
		g.fillRect(157, 523, 191, 300);
		//For bg triangle
		Polygon triangle= new Polygon();
			triangle.addPoint(40, 503);
			triangle.addPoint(268, 503);
			triangle.addPoint(270, 502);
			triangle.addPoint(303, 496);
			triangle.addPoint(223, 304);
			triangle.addPoint(184, 304);
		g.setColor(Color.darkGray);
		g.drawPolygon(triangle);
		
		g.setColor(new Color(100,100,100,180));
		g.fillPolygon(triangle);
		//For fg triangle
		Polygon closetri = new Polygon();
			closetri.addPoint(751,678);
			closetri.addPoint(725,480);
			closetri.addPoint(740,394);
			closetri.addPoint(800,35);
			closetri.addPoint(840,71);
			closetri.addPoint(975,414);
			closetri.addPoint(1024,628);
			closetri.addPoint(1024,680);
		g.setColor(Color.BLACK);
		g.drawPolygon(closetri);
		g.setColor(new Color(100,100,100,100));
		g.fillPolygon(closetri);
		//For far right outline(I ran out of nae*/
	}
}