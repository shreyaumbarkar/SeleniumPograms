package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChatgpt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chatgpt.com");
		WebElement search= driver.findElement(By.id("prompt-textarea"));
		search.sendKeys("Iphone");
		Thread.sleep(100);
		search.submit();
		driver.findElement(By.xpath("//*[@id='__next']")).click();
		
}
}
