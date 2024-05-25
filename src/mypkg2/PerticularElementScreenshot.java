package mypkg2;

import org.openqa.selenium.chrome.ChromeDriver;

public class PerticularElementScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("C:\\screenshot\\a.png");
	}

}
