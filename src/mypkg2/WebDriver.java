package mypkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://chatgpt.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("//*[@id=\"radix-:r7:\"]/div/div/button[2]/div")).click();
		
	}
		
}