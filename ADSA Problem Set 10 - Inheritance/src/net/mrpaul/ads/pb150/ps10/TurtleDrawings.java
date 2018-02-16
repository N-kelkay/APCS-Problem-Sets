package net.mrpaul.ads.pb150.ps10;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class TurtleDrawings {
	public static void main(String[] args) {
		SketchPadWindow win = new SketchPadWindow(400, 400);
        Pen p = new StandardPen(win);
        
        int move = 1;
        for (int i = 0; i <360; i++) {
        	p.down();
        	p.turn(move);
        	p.move(100);
        	p.turn(30);
        	p.move(60);
        	p.turn(-30);
        	p.move(30);
        	p.up();
        	p.home();
        	move+= 1;
        } 
        
	}
}