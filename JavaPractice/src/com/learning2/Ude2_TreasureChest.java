package com.learning2;

import java.util.Scanner;

public class Ude2_TreasureChest {
	
	
	public static void main(String args[]) {
		int boardsPerChest = 9;
		int silverPiecesPerBoard;
		int costForBoards;
		int costPerLock=2;
		int totalChestCost;
		int investment=52;
		int numChests;
		int leftOverSilver;
		
		
		System.out.println("Please enter Silver Pieces Per Board");
		Scanner sc = new Scanner(System.in);
		silverPiecesPerBoard =	sc.nextInt();
		
		costForBoards =silverPiecesPerBoard*boardsPerChest;
		System.out.println(costForBoards+" "+"Silver Pieces Per Board");
		
		
		totalChestCost =costForBoards+costPerLock;
		System.out.println(totalChestCost+" "+"Silver Pieces Total Chest Cost");
		
		numChests=investment/totalChestCost;
		System.out.println(numChests+" "+"Chests");
		
		leftOverSilver=investment-(numChests*totalChestCost);
		System.out.println(leftOverSilver+" "+"Silver Pieces Left Over");
		
		
	}
	

}
