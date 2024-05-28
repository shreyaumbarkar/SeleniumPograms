package Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButton {
    public static void main(String[] args) throws InterruptedException {
    // TODO Auto-generated method stub
            System.setProperty("webdriver.chrome.driver",
                    "Driver\\chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();// open the browser

            driver.manage().window().maximize();// maximize the windows
            driver.get("https://demoqa.com/select-menu");
           
            WebElement Colour = driver.findElement(By.id("oldSelectMenu"));
            Select selectColour=new Select(Colour);
           
            // selecting by visible text
            selectColour.selectByVisibleText("Aqua");
            Thread.sleep(100);
            selectColour.selectByVisibleText("Black");
            Thread.sleep(2000);
       
            //or Selecting multiple values by index
            selectColour.selectByIndex(0);
            selectColour.selectByIndex(2);
           
            Thread.sleep(2000);
            //Or selecting by values
            selectColour.selectByValue("4");
            //selectColour.selectByValue("Yellow");
           
           
            List<WebElement> all_options  =selectColour.getOptions();
            int count=all_options.size() ;
            System.out.println("Total options count    " +count);
           
           
            for(int i=0;i<count;i++)
            {
            String s=all_options.get(i).getText();
            System.out.println(s);
            }
       
            System.out.println("Using for each  Loop ");
            for(WebElement x :all_options)
            {
            //String s=all_options.get(i).getText();
            System.out.println(x.getText());
            }
    }
}
