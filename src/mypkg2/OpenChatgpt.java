package mypkg2;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChatgpt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chatgpt.com/");
		
}
}
