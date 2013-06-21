package com.mize.java;

import java.util.Scanner;

public class ProjectWire {
	public static void main(String[]args){
		Scanner s = new Scanner (System.in);
		while(true){
			System.out.println("Which operation do you want to perform?\n(1)Add\n(2)Subtract\n(3)Multiply\n(4)Divide");
			int i = s.nextInt();
			if(i == 1){
				System.out.println("Type two numbers to add");
				int x = s.nextInt();
				int y = s.nextInt();
				System.out.println(x + " + " + y + " = " + (x+y));
			}if(i == 2){
				System.out.println("Type two numbers to subtract");
				int x = s.nextInt();
				int y = s.nextInt();
				System.out.println(x + " - " + y + " = " + (x-y));
			}if(i == 3){
				System.out.println("Type two numbers to multiply");
				int x = s.nextInt();
				int y = s.nextInt();
				System.out.println(x + " * " + y + " = " + (x*y));
			}if(i == 4){
				System.out.println("Type two numbers to divide");
				int x = s.nextInt();
				int y = s.nextInt();
				System.out.println(x + " / " + y + " = " + (x/y) + " r" + (x%y));
			}
		}
	}
}		