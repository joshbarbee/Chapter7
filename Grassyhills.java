import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Grassyhills extends Applet{
	public void paint(Graphics g) {
		draw_stones(g);
	}
	public static void
	draw_stones(Graphics g){
		Polygon stones = new Polygon();
			stones.addPoint(955,376);
			stones.addPoint(955,376);
			stones.addPoint(955,376);
			stones.addPoint(1024,364);
			stones.addPoint(1024,654);
			stones.addPoint(940,550);
			stones.addPoint(940,442);
		g.setColor(Color.gray);
		g.fillPolygon(stones);
		Polygon grass1 = new Polygon();
			grass1.addPoint(955, 390);
			grass1.addPoint(1024, 377);
			grass1.addPoint(1024, 371);
			grass1.addPoint(956, 383);
		Polygon grass2 = new Polygon();
			grass2.addPoint(960,395);
			grass2.addPoint(,);
			grass2.addPoint(,);
			grass2.addPoint(,);
			
	
	}
}
