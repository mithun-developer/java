package com.learning2;

import java.util.Scanner;

public class Ude4_Entertainment extends Exception{
	
	 Ude4_Entertainment(String str){
		super (str);
	}
	public static void main(String args[]) {
		
		System.out.println("What is the weather like today?");
		Scanner sc = new Scanner(System.in);
		String userInput1=sc.nextLine();
		
		System.out.println("What kind of mood are you in for activities?");
		String userInput2=sc.nextLine();
		String a = "sunny";
		String b = "cloudy";
		String c = "rainy";
		
		String d = "exercise";
		String e = "party";
		String f = "quiet";
		
	
		
		try {
			if(userInput1.equalsIgnoreCase(a) && userInput2.equalsIgnoreCase(d)) {
				System.out.println("For exercise on a sunny day, try a brisk walk in nature preserve");
			}else if(userInput1.equalsIgnoreCase(a) && userInput2.equalsIgnoreCase(e)) {
				System.out.println("For fun party on a sunny day, look for a street festival");
			}else if(userInput1.equalsIgnoreCase(a) && userInput2.equalsIgnoreCase(e)) {
				System.out.println("A sunny day is beautiful time to sit under atree and read a book");
			}else if(userInput1.equalsIgnoreCase(a) && userInput2.equalsIgnoreCase(f)) {
				System.out.println("For exercise on a cloudy day the botanical gardens are a lovely walk");
			}else if(userInput1.equalsIgnoreCase(b) && userInput2.equalsIgnoreCase(d)) {
				System.out.println("For fun party on a cloudy day,ride the paddle boats at the park");
			}else if(userInput1.equalsIgnoreCase(b) && userInput2.equalsIgnoreCase(e)) {
				System.out.println("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside");
			}else if(userInput1.equalsIgnoreCase(b) && userInput2.equalsIgnoreCase(f)) {
				System.out.println("Gaint indoor trampolines are fun place to exercise on a rainy day");
			}else if(userInput1.equalsIgnoreCase(c) && userInput2.equalsIgnoreCase(d)) {
				System.out.println("See if your friends are playing board games to pass a rainy day");
			}else if(userInput1.equalsIgnoreCase(c) && userInput2.equalsIgnoreCase(e)) {
				System.out.println("A rainy day is a peaceful time to journal and daydream");
			}else if(userInput1.equalsIgnoreCase("?") && userInput2.equalsIgnoreCase("")) {
				throw new Ude4_Entertainment("Error:Your weather answer wasn't one of the valid options");
			}else if(userInput1.equalsIgnoreCase("") && userInput2.equalsIgnoreCase("?")) {
				throw new Ude4_Entertainment("Error:Your mood answer wasn't one of the valid options");
			}else {
				throw new Ude4_Entertainment("Error:PLEASE ENTER VALID OPTIONS");
			}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}

}
