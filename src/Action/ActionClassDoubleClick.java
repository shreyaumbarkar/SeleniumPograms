package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDoubleClick {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(500);
        WebElement ele = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
        Actions act = new Actions(driver);
        act.doubleClick(ele).build().perform(); 
        act.contextClick(ele).perform();
        System.out.println("HI");
    }
}