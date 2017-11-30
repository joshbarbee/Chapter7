import java.awt.Color;
import java.awt.Graphics;
import java.applet.*;
import java.util.*;


public class Lab07st extends Applet{
	public void paint(Graphics g)
	{
		Clouds.drawSky(g);
		Clouds.drawClouds(g);
		Mountains.draw_close_mountains(g);
	}
}
	