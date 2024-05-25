package mypkg2;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

   public static void main(String[] args) throws IOException {
   
       System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       TakesScreenshot ts =(TakesScreenshot) driver ;
       
       File src = ts.getScreenshotAs(OutputType.FILE);
       
       File des=new File("C:\\screenshot\\facebook.png");
       
       FileHandler.copy(src, des);

   }

}
