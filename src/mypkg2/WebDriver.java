package mypkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
public class WebDriver {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com");
		WebElement logo=driver.findElement(By.xpath("//div[@class=\"x78zum5 xdt5ytf\"]"));
		File f= logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\screenshot.png"));
		
	}
		
}