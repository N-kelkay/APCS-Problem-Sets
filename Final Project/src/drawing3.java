import java.awt.Color;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class drawing3 {
	public static void main(String[] args) {
		SketchPadWindow win = new SketchPadWindow(800, 800);
		Pen pen = new StandardPen(win);
		
		pen.setColor(Color.blue);
		for(int i = 0; i < 51; i++) {
			pen.move(50);
			pen.turn(125);
			pen.move(123);
		}
		
		pen.setColor(Color.red);
		for(int i = 0; i <51; i++) {
			pen.move(100);
			pen.turn(115);
			pen.move(123);
		}
		
		
	}
}
