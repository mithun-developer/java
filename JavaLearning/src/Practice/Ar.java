package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Ar {
	public static void main(String args[]) {
		
		/*int result = 0;
		for (int i = 0; i < 5; i++) {
		  if (i == 3) { 
		     result += 10;
		   } else {
		     result += i;
		   }	
		}
		System.out.println(result);*/
		
		
	//************************************************************	
		
	/*	for(int i = 0; i <= 5; i++ )
        {
            System.out.println("i = " + i );
   
        }*/
		
		
	//***********************************************************	
		
		/*for(int i=0;i<=10;i++) {
			System.out.println(i);
		}*/
	
		//******************************************************
		
		/*System.out.println("please enter number");
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	for(int i=num;i<=10;i++) {
		int tab= i*num;
	System.out.println(tab);
	}
	*/
		
		//*************************************************
		
		/*System.out.println("please enter number");
		Scanner s = new Scanner(System.in);
		
		int fac=1;
		int num = s.nextInt();
		for(int i=1;i<=num;i++) {
		  fac=fac*i;
		
		}
		 System.out.println(fac);*/
	
	//******************************************
		System.out.println("please enter number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i=1;i<num;i++) {
		int ab = num-i;
	
			ArrayList<Integer>al = new ArrayList(ab);
			System.out.println(ab);
			
			
			
		}
	
	
	
	
	}

}
