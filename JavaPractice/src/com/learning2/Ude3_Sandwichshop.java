package com.learning2;

import java.util.Scanner;

public class Ude3_Sandwichshop {
	
	public static void main(String args[]) {
		int goalForVeggies=50;
		int goalForBurgers=250;
		int goalForSubs=180;
		int goalForSoup=70;
		
		System.out.println("How many veggie sandwiches were sold today?");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>goalForVeggies) {
			System.out.println("Made goal");
		}else {
			System.out.println("Fell Short");
		}
		
		System.out.println("How many Burgers were sold today?");
		
		int b = sc.nextInt();
		if(b>goalForBurgers) {
			System.out.println("Made goal");
		}else {
			System.out.println("Fell Short");
		}
		
		System.out.println("How many Subs were sold today?");
		
		int c = sc.nextInt();
		if(c>goalForSubs) {
			System.out.println("Made goal");
		}else {
			System.out.println("Fell Short");
		}
		
		System.out.println("How many Soup were sold today?");
		
		int d = sc.nextInt();
		if(d>goalForSoup) {
			System.out.println("Made goal");
		}else {
			System.out.println("Fell Short");
		}
		
		
	}

}
