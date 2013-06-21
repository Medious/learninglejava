package com.mize.java;

import java.util.Random;
import java.util.Scanner;

public class ProjectAssassin {
	public static void main(String[]args){
		Scanner s = new Scanner (System.in);
		Random r= new Random();
		System.out.println("A giant enemy crab has appeared! You have no choice but to fight!\n Enemy health:100");
		int h=100;

		while(h > 0){
			System.out.println("[1]Punch\n[2]Kick\n[3]Tornado kick\n[4]Double clench-fist");
			
		}
	}

}
