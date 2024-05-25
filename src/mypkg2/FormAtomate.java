package mypkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAtomate {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstname.sendKeys("Shreya");
		WebElement lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastname.sendKeys("Umbarkar");
		driver.findElement(By.xpath("//input[@id=\"sex-1\"]")).click();	
		driver.findElement(By.xpath("//input[@id=\"exp-1\"]\r\n")).click();		
		WebElement date=driver.findElement(By.xpath("//input[@id=\"datepicker\"]\r\n"));
		date.sendKeys("21/05/2024");
		driver.findElement(By.xpath("//input[@id=\"sex-1\"]")).click();	
		driver.findElement(By.xpath("//input[@id=\"profession-1\"]")).click();
        driver.findElement(By.id("tool-2")).click();
        WebElement countries= driver.findElement(By.xpath("//select[@id=\"continents\"]"));
        Select option= new Select(countries);
        option.selectByVisibleText("Africa");
	}

}
