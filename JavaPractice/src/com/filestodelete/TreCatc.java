package com.filestodelete;

import java.util.Scanner;

public class TreCatc extends Exception{
	
	TreCatc(String st){
		super(st);
	}
	
	public static void main(String args[]) {
		System.out.println("Please enter your team name");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String dtd []= {"Mithun","Maruthi","Shiva"};
		String ada []= {"Sirisha","Keerthana","Sai"};
		try {
			if(str.equalsIgnoreCase("dtd")) {
				//System.out.println("Mithun"+" "+ "Maruthi"+" "+"Shiva");
 for(int i=0;i<dtd.length;i++) {
	 System.out.println(dtd[i]);
 }

				
				
			}else if(str.equalsIgnoreCase("ada")) {
				//System.out.println("Sirisha"+" "+"Keerthana"+" "+"Sai");
				for(int j=0;j<ada.length;j++) {
					System.out.println(ada[j]);
				}
				
			}else {
				throw new TreCatc("YOU HAVE ENTERED WRONG VALUE");
				
				
			}
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
