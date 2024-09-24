package com.learning4;

import java.text.DecimalFormat;

public class PercentageOfLettersInString {
	
	public static void main(String args[]) {
		
		String name="keerthana is Good Girl 100%";
		
		
		
		
		int uppercase=0;
		int lowercase=0;
		int digits=0;
		int specialcharacters=0;
		int totalchar=name.length();
		
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppercase++;
			}else if(Character.isLowerCase(ch)) {
				lowercase++;
			}else if(Character.isDigit(ch)) {
				digits++;
			}else {
				specialcharacters++;
			}
				
			
		}
		
		double uc = (uppercase*100)/totalchar;
		double lc = (lowercase*100)/totalchar;
		double dg = (digits*100)/totalchar;
		double sc = (specialcharacters*100)/totalchar;
		
		//DecimalFormat format = new DecimalFormat("##.##");  
		System.out.println(uc);
		System.out.println(lc);
		System.out.println(dg);
		System.out.println(sc);
	}

}
