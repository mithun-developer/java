package com.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.poi.util.SystemOutLogger;

public class FileDemo2 {

	public static void main(String[] args) {
		Path path =Paths.get("G:\\Drive D\\LOADRUNNER\\New Technologies\\Java\\Demo1.txt");
		
		try(Stream <String> lines = Files.newBufferedReader(path).lines()) {
			
		
			lines.forEach(System.out::println);
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}


}