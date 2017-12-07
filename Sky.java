import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.math.*;
import java.util.*;

public class Sky extends Applet{
	public void paint(Graphics g)
	{
		AddSun(g);
		day(g);
		
		
	}
	
	public static void night(Graphics g)
	{
		int R = 0;
		int G = 0;
		int B = 0;
		
		int ycoord = 0;
		
		for (int l = 0; l < 80; l++)
		{
			g.setColor(new Color(R,G,B));
			g.fillRect(0, ycoord, 1024, 10);
			B++;
			ycoord += 10;
		}
	}
	
	public static void evening(Graphics g)
	{
		g.setColor(new Color(225, 0, 255));
		g.fillRect(0, 0, 1024, 800);
		
		int R = 30;
		int G = 0; 
		int B = 30; 
		
		int ycoord = 0;
		
		for (int k = 1; k < 225; k++)
		{
			g.setColor(new Color(R, G, B));
			g.fillRect(0, ycoord, 1024, 3);
				R++;
				B++;
			ycoord += 3;
		}
	}
	
	public static void day(Graphics g)
	{
		g.setColor(new Color(115, 186, 220));
		g.fillRect(0, 0, 1024, 800);
		
		int R = 35;
		int G = 106;
		int B = 150;
		
		int startycoord = 0;
		
		for (int l = 0; l < 100; l ++)
		{
			g.setColor(new Color(R,G,B));
			g.fillRect(0, startycoord, 1024, 3);
			B++;
			G++;
			R++;
			startycoord += 3;
		}	
	}
	
	public static void AddStars(Graphics g)
	{
		for(int i = 1; i < 60; i++)
		{
			int randxcoord = (int)(Math.random() * 997);
			int randycoord = (int)(Math.random() * 497);
			g.setColor(Color.white);
			g.fillRect(randxcoord, randycoord, 3, 3);
		}
	}
	
	public static void AddSun(Graphics g)
	{
		g.setColor(new Color(255,255,146));
		g.fillOval(800, 75, 100, 100);
	}
	
	public static void AddSurface(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillRect(0, 500, 1024, 300);
	}
		
		

		
	
	}	

