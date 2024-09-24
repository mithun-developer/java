package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	String name;
	int num;
	
	Employee(String name, int num){
		
		this.name=name;
		this.num=num;
		
	}

}
