package basicTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

		public static void main(String[] args) {
			
			System.out.println("Hi....!!!!! :)");
			
			//WebDriver driver;
			//driver = new ChromeDriver();
			//driver = new IEDriver();
			
			System.setProperty("webdriver.chrome.driver", "C://Coding//chromedriver_win32//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		/*	driver.manage().window().maximize();
			driver.get("https://www.google.com");
		*/
		
		}



	
}
