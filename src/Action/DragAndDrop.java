package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement from =driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement To=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));	
		Actions act=new Actions(driver);						
	         act.dragAndDrop(from, To).build().perform();		
		}		
	}


