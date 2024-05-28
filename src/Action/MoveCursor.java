package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveCursor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement ele=driver.findElement(By.linkText("Electronics"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		 
	}

}
