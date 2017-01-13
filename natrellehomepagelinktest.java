package natrellehomepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class natrellehomepagelinktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Will perform test on every link of Natrelle home page in chrome.
		System.setProperty("webdriver.chrome.driver", "/Users/marksgaaccount/Desktop/Webdrivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.natrelle.com");
		
	}

}
