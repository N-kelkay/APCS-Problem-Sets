import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class dawing2 {
	public static void main(String[] args) {
		SketchPadWindow win = new SketchPadWindow(800, 800);
		Pen pen = new StandardPen(win);
		
		int x =(int)(Math.random() * 401);
		int[] y = new int[400];
		
		for(int i = 0; i < y.length; i++) {
			y[i] = x;
		}
		
		for(int i = 0; i < 1000; i++) {
			pen.up();
			pen.move(-400, 400);
			pen.move(1+40);
			pen.down();
			
			pen.move(i);
			pen.turn(91);
		}
	}
}
