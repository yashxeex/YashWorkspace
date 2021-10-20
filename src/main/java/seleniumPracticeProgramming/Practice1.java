package seleniumPracticeProgramming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/yashrajpal/Desktop/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/first-webdriver-script.html");

	}

}
