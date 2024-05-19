package mypkg2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium_Ex {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://whatsapp.com");
	driver.manage().window().maximize();
}

}
