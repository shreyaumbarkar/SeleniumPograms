package mypkg2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DropDownEx {


	    public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/select-menu");
	    WebElement option= driver.findElement(By.xpath("//div[text()='Select Option']"));
	    option.click();
	    option.sendKeys("Group1,option1");
	    
	    //Select selectoption= new Select(option);
	   // selectoption.selectByVisibleText("Group1,option1").sendskeys();
	    
	}

}
