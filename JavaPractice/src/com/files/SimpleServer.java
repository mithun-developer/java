package com.files;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws IOException {
	
		
		ServerSocket skt = new ServerSocket(12345);
		
		while(true) {
			Socket accept = skt.accept();
			System.out.println("we have a request!");
			
			
			InputStream	 input = accept.getInputStream();
			
			InputStreamReader inr = new InputStreamReader(input);
			
			LineNumberReader line = new LineNumberReader(inr);
			String request = line.readLine();
			
			System.out.println(request);
			
			if(request.equals("list-fruits")) {
				
				OutputStream out = accept.getOutputStream();
				OutputStreamWriter ow = new OutputStreamWriter(out);
				PrintWriter pw = new PrintWriter(out);
				pw.println(3);
				pw.println("apple");
				pw.println("orange");
				pw.println("banana");
				pw.flush();
			}
			
			
			
			
			
		}
		
		
	}

}
