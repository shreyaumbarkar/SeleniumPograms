package mypkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		WebElement element= driver.findElement(By.name("identifier"));
		element.sendKeys("shreyaumbarkar2307@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/div/a")).click();
		
	}

}
