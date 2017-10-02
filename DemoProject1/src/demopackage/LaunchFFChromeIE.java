package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchFFChromeIE {

	public static void main(String[] args) {

		//How to launch mozilla firefox
		WebDriver driver = new FirefoxDriver(); 
		
		//How to launch Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.navigate().to("");
		
		//Launch Internet Explorer
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		WebDriver driver2 = new InternetExplorerDriver();
		driver2.navigate().to("???")
		;

		
		

	}

}
