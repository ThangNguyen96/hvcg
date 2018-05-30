package com.thangnd.oop;

//import exercise.ex51.Point;

public class Runner {

	public static void main(String[] args) {
		Point p = new AnotherPoint();
		p.setX(3);
		p.setY(5);
		
		System.out.println(p.getXY()[0]);
		System.out.println(p.getXY()[1]);
		
		p.setXY(2, 4);
		System.out.println(p.getX());
		System.out.println(p.getY());
	}

}
