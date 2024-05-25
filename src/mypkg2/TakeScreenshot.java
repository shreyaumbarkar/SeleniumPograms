package mypkg2;

import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.whatsapp.com");
	

	}

}
