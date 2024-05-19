package mypkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo_Google {

   public static void main(String[] args)
   {
       // TODO Auto-generated method stub
       
       //System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
  System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
       
  WebDriver driver = new ChromeDriver();// open the browser
       
       
  driver.get("https://www.google.com");

   }

}
