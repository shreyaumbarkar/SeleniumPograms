package mypkg2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {

	public static void main(String[] args) 
	throws InterruptedException{
		System.setProperty("webdriver.chromedriver.driver", "driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		String text1 = driver.getTitle();
		//System.out.println("Title of webpage "+ text1);
		//String text2= driver.getCurrentUrl();
		//System.out.println("Current url of webpage "+ text2);
		driver.navigate().to("https://whatsapp.com");
		driver.navigate().to("https://gmail.com");
		Thread.sleep(5); //5000 microsecond
		driver.navigate().back();
		Thread.sleep(5);
		driver.navigate().forward();
		Thread.sleep(5);
		driver.navigate().refresh();
		Thread.sleep(5);
		driver.manage().window().maximize();
		driver.close();
		
		
		
	}

}
