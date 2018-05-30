package com.thangnd.oop;

public class AnotherPoint implements Point {
	
	private int[] p;

	
	public AnotherPoint() {
		p = new int[2];
	}
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return p[0];
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		p[0] = x;
		
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return p[1];
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		p[1] = y;
		
	}

	@Override
	public int[] getXY() {
		return p;
	}

	@Override
	public void setXY(int x, int y) {
		p[0] = x;
		p[1] = y;
	}
	
	

}
