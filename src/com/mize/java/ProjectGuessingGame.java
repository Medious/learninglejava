package com.mize.java;

import java.util.Random;
import java.util.Scanner;

public class ProjectGuessingGame {
	public static void main(String[]args){
		Scanner s = new Scanner (System.in);
		Random bkrandy = new Random();
		int r = bkrandy.nextInt(100);
		boolean correct = false; 
		int tries=5;
		while(!correct){
			System.out.println("Guess a number between 0 and 100! Beware! You only have " + tries + " tries");
			int x = s.nextInt();
			if(x>r){
				tries-=1;
				System.out.println("Too high!");}
			if(x<r){
				tries-=1;
				System.out.println("Too low!");}
			if(r==x){
				correct=true;
				System.out.println("You guessed right! Great job!");
			}if (tries==0){
				System.out.println("You failed! The number was " + r + "!");
				correct=true;
			}
		}
	}
}