package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
        Thread.sleep(1000);
        a.accept();
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("login1")).sendKeys("Shreya Umbarkar");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Shreya@002");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
       //driver.quit();
        driver.findElement(By.xpath("//a/u[text()='Create a new account']")).click();
		
	}

}
