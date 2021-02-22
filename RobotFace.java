package week2;

import acm.program.GraphicsProgram;

import java.awt.*;
import java.awt.color.*;
import acm.graphics.*;
import acm.program.*;


public class RobotFace extends GraphicsProgram {
	public void run () {
	
GLabel label1 = new GLabel ("R o b o t F a c e", 140,50);
label1.setFont("Font.MONOSPACED-60");
label1.setColor(Color.CYAN);
add (label1);
		
		GRect rect1 = new GRect (200, 75, 300, 500);
		rect1.setFillColor(Color.GRAY);
		rect1.setFilled(true);
		add (rect1);
	
	GOval oval1 = new GOval (240,135,50,50);
	oval1.setFilled(true);
	oval1.setColor(Color.YELLOW);
	add (oval1);
	
	GOval oval2 = new GOval (410,135,50,50);
	oval2.setFilled(true);
	oval2.setColor(Color.YELLOW);
	add (oval2);
	
	GRect rect2 = new GRect (250,350,200,60);
	rect2.setFilled(true);
	rect2.setColor(Color.WHITE);
	add (rect2);
	
	
	}
}
