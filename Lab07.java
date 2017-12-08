import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;
import java.util.*;


public class Lab07 extends Applet{
	public void paint(Graphics g)
	{
		this.setSize(1024,650);
		Sky.evening(g);
		Sky.AddStars(g);
		
		Clouds.drawClouds(g);
		
		Mountains.draw_far_mountains(g);
		Mountains.draw_grass_fm(g);
		Mountains.draw_stones(g);
		Mountains.draw_close_mountains(g);
		Mountains.draw_grass_cm(g);
		
		Grassyhills.draw_stones(g);
		Grassyhills.draw_grass(g);
		
		Buildings.draw_buildings(g);
		
		Buildings.draw_stones(g);
		Buildings.draw_outlines(g);
		
		
	}
}
	