package mypkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	 public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	    driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");
	    WebElement option= driver.findElement(By.id("pet-select"));
	    Select selectoption = new Select(option);
        selectoption.selectByVisibleText("Dog");
        Thread.sleep(1000);
        selectoption.selectByVisibleText("Cat");
        Thread.sleep(1000);
	}

}
