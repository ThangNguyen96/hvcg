package exercise.ex51;

public class LineSub extends Point {
	Point end;
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY);
		this.end = new Point(endX, endY);
	}
	public LineSub(Point begin, Point end) {
		super(begin.getX(), begin.getY());
		this.end = end;
	}
	
	public Point getBegin() {
		return this;
	}
	public Point getEnd() {
		return end;
	}

}
