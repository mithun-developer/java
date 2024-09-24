package com.encapsulation;

public class Ed1 {
	
	int account = 589340834;
	private	int amount = 1000;


/**
 * @return the amount
 */
public int getAmount() {
	return amount;
}
/**
 * @param amount the amount to set
 */
public void setAmount(int amount) {
	System.out.println("Amount is debiting from your Account 589340834");
	this.amount = amount;
}



}
