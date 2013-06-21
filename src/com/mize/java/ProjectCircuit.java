package com.mize.java;

import java.util.Scanner;

public class ProjectCircuit {
	public static void main(String[]args){
		Scanner s = new Scanner (System.in);
		System.out.println("Do you want to add or subtract? Type a positive number to add, or a negative number to subtract");
		int i = s.nextInt();
		if(i > 0){
			System.out.println("Type two numbers to add");
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x + " + " + y + " = " + (x + y));
		}else if(i < 0){
			System.out.println("type two numbers to subtract");
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println(x + " - " + y + " = " + (x - y));}
	}
}
