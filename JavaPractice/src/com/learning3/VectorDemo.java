package com.learning3;
import java.util.*;

public class VectorDemo {
	
	
	 String name,loc;
		
	 public VectorDemo(String name, String loc) {
			this.name = name;
			this.loc = loc;
		}
	public static void main(String[] args) {
		
		
   Vector<VectorDemo> v = new Vector(2);
   
   
		System.out.println("Vecotor capacity is :"+v.capacity());
		
      VectorDemo vd1 = new VectorDemo("Mithun","Hyd");
    VectorDemo vd2 = new VectorDemo("Keerthana","Hyd");
		VectorDemo vd3 = new VectorDemo("Sirisha","Hyd");
		
		v.add(vd1);
		v.add(vd2);
		v.add(vd3);
		System.out.println("Now vector is having elements:"+v.size());
		
		for(VectorDemo vd:v) {
			System.out.println(vd.name+" "+vd.loc);
		}
		
	}

}
