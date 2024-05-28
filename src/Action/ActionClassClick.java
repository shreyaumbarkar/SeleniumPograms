package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.xpath("//button[@id=\"iN8Co\"]"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).click().perform();
	}

}
