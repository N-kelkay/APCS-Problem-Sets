import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;

public class drawings {
	public static void main(String[] args) {
		SketchPadWindow win = new SketchPadWindow(800, 800);
		Pen p = new StandardPen(win);

		int move = 1;

		//Drawing:
			for (int i = 0; i <501; i++) {
				p.move(i);
				p.turn(91);
			}
	}
}
