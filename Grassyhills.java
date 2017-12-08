import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Grassyhills extends Applet{
	public void paint(Graphics g) {
		draw_stones(g);
		draw_grass(g);
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
		for(int k = 0; k < 200000; k++) {
			int randx = (int)(Math.random()*300)+800;
			int randy = (int)(Math.random()*700); 
			int R = (int) Math.round(Math.random()*15)+110;
			int B = (int) Math.round(Math.random()*20)+110;
			int G = (int) Math.round(Math.random()*20+110);
			if(stones.contains(randx, randy)) {
				g.setColor(new Color(R,G,B));
				g.drawLine(randx, randy, randx, randy);
				g.setColor(new Color(R-20,G-20,B-20));
				g.drawLine(randx-1, randy-1, randx-1, randy-1);}
		}
		}
	
	public static void 
	draw_grass(Graphics g) {
		Polygon grass1 = new Polygon();
			grass1.addPoint(955, 390);
			grass1.addPoint(1024, 377);
			grass1.addPoint(1024, 371);
			grass1.addPoint(956, 383);
		Polygon grass2 = new Polygon();
			grass2.addPoint(960,395);
			grass2.addPoint(962,399);
			grass2.addPoint(1024,389);
			grass2.addPoint(1024,383);
		Polygon grass3 = new Polygon();
			grass3.addPoint(966, 408);
			grass3.addPoint(966, 412);
			grass3.addPoint(1024, 402);
			grass3.addPoint(1024, 397);
		Polygon grass4 = new Polygon();
			grass4.addPoint(956,416);
			grass4.addPoint(956,420);
			grass4.addPoint(1024,417);
			grass4.addPoint(1024,410);
		Polygon grass5 = new Polygon();
			grass5.addPoint(960, 435);
			grass5.addPoint(960, 440);
			grass5.addPoint(1024, 434);
			grass5.addPoint(1024, 430);
		Polygon grass6 = new Polygon();
			grass6.addPoint(960, 496);
			grass6.addPoint(960, 490);
			grass6.addPoint(1024, 495);
			grass6.addPoint(1024, 505);
		Polygon grass7 = new Polygon();
			grass7.addPoint(986, 452);
			grass7.addPoint(986, 456);
			grass7.addPoint(1024, 453);
			grass7.addPoint(1024, 448);
		Polygon grass8 = new Polygon();
			grass8.addPoint(988, 470);
			grass8.addPoint(988, 475);
			grass8.addPoint(1024, 473);
			grass8.addPoint(1024, 468);
		Polygon grass9 = new Polygon();
			grass9.addPoint(1000, 543);
			grass9.addPoint(1000, 549);
			grass9.addPoint(1024, 549);
			grass9.addPoint(1024, 543);
		Polygon grass10 = new Polygon();
			grass10.addPoint(1000, 572);
			grass10.addPoint(1000, 583);
			grass10.addPoint(1024, 583);
			grass10.addPoint(1024, 571);
			
		g.setColor(new Color(159,183,87));
		g.fillPolygon(grass1);
		g.fillPolygon(grass2);
		g.fillPolygon(grass3);
		g.fillPolygon(grass4);
		g.fillPolygon(grass5);
		g.fillPolygon(grass6);
		g.fillPolygon(grass7);
		g.fillPolygon(grass8);
		g.fillPolygon(grass9);
		g.fillPolygon(grass10);
		
	}
}
