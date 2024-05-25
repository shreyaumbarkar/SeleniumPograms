package mypkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateToolqa {

	public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	WebElement firstname= driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
	firstname.sendKeys("Shreya");
	WebElement lastname= driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	lastname.sendKeys("Umbarkar");
	WebElement useremail= driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
	useremail.sendKeys("shreyaumbarkar2307@gmail.com");
	driver.findElement(By.xpath("//div[text()='Gender']/../div/div[2]")).click();
	
	WebElement mobilenumber= driver.findElement(By.xpath("//input[@id=\"userNumber\"]"));
	mobilenumber.sendKeys("7058596420");
	WebElement DOB= driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]"));
	DOB.sendKeys("23/07/2001");
	WebElement subject= driver.findElement(By.xpath("//div[@id=\"subjectsContainer\"]"));	
	subject.sendKeys("Physics");
	//WebElement countries= driver.findElement(By.xpath("//select[@id=\"continents\"]"));
    //Select option= new Select(countries);
    //option.selectByVisibleText("Africa");
	}

}
