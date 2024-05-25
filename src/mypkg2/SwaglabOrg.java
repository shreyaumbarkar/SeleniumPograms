package mypkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwaglabOrg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		WebElement name= driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		name.sendKeys("standard_user");
		WebElement pass= driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys("secret_sauce");
		WebElement login= driver.findElement(By.xpath("//input[@class=\"btn_action\"]"));
		login.click();
		driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		String currentwindowHandle1 = driver.getWindowHandle();
	    driver.switchTo().window(currentwindowHandle1);
	    driver.findElement(By.xpath("//*[contains(@class,'svg-inline--fa fa-shopping-cart fa-w-18 fa-3x')]")).click();
	    driver.findElement(By.linkText("CHECKOUT")).click();
	    WebElement firstname= driver.findElement(By.xpath("//input[@id=\"first-name\"]"));
	    firstname.sendKeys("Shreya");
	    WebElement lastname= driver.findElement(By.xpath("//input[@id=\"last-name\"]"));
	    lastname.sendKeys("Umbarkar");
	    WebElement zipcode= driver.findElement(By.xpath("//input[@id=\"postal-code\"]"));
	    zipcode.sendKeys("444122");
	    driver.findElement(By.xpath("//input[@class=\"btn_primary cart_button\"]")).click();
	    driver.findElement(By.linkText("FINISH")).click();
	    String currentwindowHandle2=driver.getWindowHandle();
	    driver.switchTo().window(currentwindowHandle2);
	   
	    }

}
