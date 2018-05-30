package com.thangnd.oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
		int i = sc.nextInt();
		System.out.println(i + 6);
		i = sc.nextInt();
		System.out.println(i + 3);
		i = sc.nextInt();
		System.out.println(i + 1);
		}
		catch(Exception e) {
			System.out.println("gia tri khong hop le");
		} finally {
			System.out.println("chuong trinh ket thuc");
		}
		

	}

}
