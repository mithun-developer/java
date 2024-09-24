package com.files;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) throws IOException {

		
		Socket skt = new Socket();
		InetSocketAddress address = new InetSocketAddress("127.0.0.1",12345);
		skt.connect(address);
		
		
		
		OutputStream out =skt.getOutputStream();
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
		pw.println("list-fruits");
		
		pw.flush();
		
		InputStream	 input = skt.getInputStream();
		
		LineNumberReader line = new LineNumberReader(new InputStreamReader(input));
		
		int number = Integer.parseInt(line.readLine());
		for(int i=0;i<number;i++) {
			String fruit = line.readLine();
			System.out.println(fruit);
		}
		
		skt.close();
		
		
		
	}

}
