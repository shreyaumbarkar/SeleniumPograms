package mypkg2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Selenum {
public static void main(String args[])
{
	System.setProperty("webdriver.edge.driver","driver//msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.microsoft.com");
}
}
