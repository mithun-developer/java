package com.tick;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Addddd{
	
	@RequestMapping("acting")
	public String hi(@ RequestParam("num1")int i, @ RequestParam("num2")int j) {
		
		
		return (i+j)+" ";
		
	
		
	
		
		
	}

}
