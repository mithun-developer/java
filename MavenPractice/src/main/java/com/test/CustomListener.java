package com.test;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

     public class CustomListener extends Base implements ITestListener{

		
		@Override
		public void onTestFailure(ITestResult result) {
		
				try {
					failed(result.getMethod().getMethodName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

		

}
