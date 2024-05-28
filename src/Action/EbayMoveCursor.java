package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EbayMoveCursor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.linkText("Sports"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
		WebElement find=driver.findElement(By.linkText("Cycling"));
		Actions acts= new Actions(driver);
		acts.doubleClick(find).perform();
		 
	}

}
