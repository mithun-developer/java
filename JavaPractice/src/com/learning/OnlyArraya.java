package com.learning;

public class OnlyArraya {

	public static void main(String args[]) {

		int w[]= new int[3];

		w[0]=888;
		w[1]=999;
		w[2]=1000;

		for(int i=0;i<w.length;i++) {
			System.out.println(w[i]);
		}
		
		System.out.println("***********");
		
		for(int i:w) {
			System.out.println(i);
		}
		
		System.out.println("****************");
		
		String a[][]= {{"Mithun","DTD"},{"Keerthana","ADA"}};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[1].length;j++) {
				System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}

		
		System.out.println("***********");
		
		for(String i[]:a) {
			for(String j:i) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}

}
