package com.thangnd.oop;

public class MyPoint   {
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		return new int[]{x, y};
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
