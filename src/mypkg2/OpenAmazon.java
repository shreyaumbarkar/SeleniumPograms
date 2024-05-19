package mypkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenAmazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone");
		Thread.sleep(100);
		search.submit();
		driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Blue/dp/B09G9BL5CP/ref=sr_1_2_sspa?dib=eyJ2IjoiMSJ9.eVHLtqclHKl9W0HCqK-nivGYX7tcy0X-dVfjexei_pudFVNlFkE5k3U1aDLD2afrgsLOrSpR8qDwlYS8yWGMEdCHCbezwLSyzPyoEzXVJpqlB7Z3XpGh9uNAxNDzA8f0cRUcSYzNFmXGqafzWfdSK1ev3efCiw-sHGxzk0Znecszfzc8IOeP_6e_GGlWuDC8Z3a-KDqSlfLVswtAN37S5-ez1KGBPYWG-tZjwtRAgr4.fN47wzY4wBOxCipL6hM2Z1OxtPzg_uk5yi3omgtzqfY&dib_tag=se&keywords=Iphone&qid=1715736983&sr=8-2-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		Thread.sleep(100);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		
		
		
		
	}

}
