package mypkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
		public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		WebElement uploadfile= driver.findElement(By.xpath("//input[@id=\"uploadFile\"]"));
		uploadfile.sendKeys("C:\\Users\\shrey");
	}

}
