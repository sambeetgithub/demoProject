package demopackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFIle {

	public static void main(String[] args) {
		FileInputStream fis = null; 
		//FIle
		File file1 = new File("C:\\Users\\Prakash\\workspace\\DemoProject1\\src\\demopackage\\config.properties");
		
		//FileInoutStream
		try {
	fis = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		//define a properties
		Properties prop = new Properties();
		
		//load the data
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// read data from properties file
		
		String urlfromProp = prop.getProperty("URL");
		System.out.println(urlfromProp);
	}

}
