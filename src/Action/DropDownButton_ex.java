package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton_ex {
    public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/select-menu");
            WebElement Colour = driver.findElement(By.id("oldSelectMenu"));
            Select selectColour=new Select(Colour);
            selectColour.selectByVisibleText("Magenta");
            selectColour.selectByValue("5");
           
           
           
            
            
    }
}