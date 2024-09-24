package com.learning2;

import java.util.Scanner;

public class Ude5_Flowchart {
	
	public static void main(String args[]) {
		int chair=2;
		int table=3;
		int floorlamp=4;
		int food=5;
		int curtain=6;
		int window=7;
		int floor=8;
	//	int floor=9;
		int dish=10;
		int down=11;
		//int window=12;
		
		System.out.println("You are a small, hungry field mouse. You find yourself standing in a mouse hole in the kitchen of a farm house. In the room is a bowl of cat food that smells really tasty. A young cat is sleeping on a rug in the middle of the room.\r\n" + 
				"Looking around the room, you see a wooden table with chairs, a metal floor lamp, and curtains over a window. You can smell a summer breeze blowing in.\r\n" + 
				"Where do you go?");
		
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt()==2 || sc.nextInt()==3  || sc.nextInt()==4 || sc.nextInt()==5 || sc.nextInt()==6 || sc.nextInt()==7 || sc.nextInt()==8
			 || sc.nextInt()==9 || sc.nextInt()==10 || sc.nextInt()==11 || sc.nextInt()==12){
			
			System.out.println("You sneak quietly to the chair and climb its rough wood. "
					+ "The only place you can reach from here is the table, so you climb it too. Looking around from the table, you see two paths. "
					+ "You can walk across the countertop to the open window, or you can climb down the table leg to the floor.");
		}
		
		
		
	}

}
