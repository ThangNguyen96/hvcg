package exercise.ex51;

public class Line {
	private Point begin;
	private Point end;
	
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
		
	}
	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
		
	}
	
	public Point getBegin() {
		return this.begin;
	}
	public Point getEnd() {
		return this.end;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public void setEnd(Point end ) {
		this.end = end;
	}
	
	
	
	public int getBeginX() {
		return begin.getX();
	}
	public int getBeginY() {
		return begin.getY();
	}
	public int getEndX() {
		return end.getX();
	}
	public int getEndY() {
		return end.getX();
	}
	
	
	
	
	
	public void setBeginX(int x) {
		begin.setX(x);
	}
	public void setBeginY(int y) {
		begin.setY(y);
	}
	public void setBeginXY(int x, int y) {
		begin.setX(x);
		begin.setY(y);
	}
	public void setEndX(int x) {
		end.setX(x);
	}
	public void setEndY(int y) {
		end.setY(y);
	}
	public void setBEndXY(int x, int y) {
		end.setX(x);
		end.setY(y);
	}
	
}
