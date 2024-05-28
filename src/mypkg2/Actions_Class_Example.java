package mypkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver.driver", "driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(500);
		//https://demoqa.com/buttons
		WebElement ele=driver.findElement(By.xpath("//*[@id='authentication']/button"));
		//button[@id='doubleClickBtn']
		
		Actions act=new Actions(driver);
		act.doubleClick().perform();
		act.contextClick(ele).perform();
		
		
		//String text1 = driver.getTitle();

	}

}
