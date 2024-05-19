package mypkg2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		//object of web driver
		//webdriver.chrome.driver : name of driver 
		//driver\\chromedriver.exe : path of the driver 
		//ChromeDriver driver= new ChromeDriver();
		
//The system setProperty method has two attributes –
//“propertyName” and “value.” The propertyName represents 
//the name of the browser-specific driver, and the value points to the path of that browser driver.
		
		WebDriver  driver= new ChromeDriver();//chrome driver is class that extebd  a property of web driver interface
		driver.get("https://www.whatsapp.com//");
		System.out.println(driver.getPageSource());
		//System.out.println(driver.navigate());
		System.out.println(driver.getTitle());
	
	}
}
                                 