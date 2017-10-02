package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprog {
	
	public static void main(String[] args) {
		
		//set the property
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//open firefox browser  --> driver
		WebDriver driver = new ChromeDriver();
		
		//navigate to www.testautomator.in
		driver.navigate().to("http://testautomator.in");
		
		//get page title 
		String pageTitle = driver.getTitle();
		
		//display page title
		System.out.println(pageTitle);
		
		//close browser
		driver.close();
	}

}
