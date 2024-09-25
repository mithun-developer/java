package javapractive.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * Hello world!
 *
 */
public class App {
	
	static Workbook wb ;
	static Sheet st;
	static FileInputStream fis;
	static FileOutputStream fos;
	static Row row;
	static Cell cell;
	
	
	
    public static void main( String[] args ) throws FileNotFoundException
    {
       fis = new FileInputStream("C:\\Users\\Mithun\\Desktop\\Collections\\Demo.xls");
      
       
       
    }
}
