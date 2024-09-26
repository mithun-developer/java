package com.practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageConversion {
	
	public static void main(String[] args) throws IOException {
		
		URL url = new URL("https://images-eu.ssl-images-amazon.com/images/G/31/img21/CEPC/Clearance/May21/D23947948_IN_CEPC_Clearance-store_May21_rush_1500x300.jpg");
		BufferedImage image = ImageIO.read(url);
		ImageIO.write(image, "jpg", new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\SELENIUM\\captured screenshots\\laptop.jpg"));
		ImageIO.write(image, "gif", new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\SELENIUM\\captured screenshots\\laptop.gif"));
		ImageIO.write(image, "png", new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\SELENIUM\\captured screenshots\\laptop.png"));
		ImageIO.write(image, "bmp", new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\SELENIUM\\captured screenshots\\laptop.bmp"));
		ImageIO.write(image, "tiff", new File("G:\\Drive D\\LOADRUNNER\\New Technologies\\SELENIUM\\captured screenshots\\laptop.tiff"));
	}

}
