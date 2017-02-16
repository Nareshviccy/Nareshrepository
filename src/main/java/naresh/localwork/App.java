package naresh.localwork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class App 
{
	public  WebDriver driver = new FirefoxDriver();

@Test	
public void Sample()
{	
	System.out.println( "Hello World!" );

       driver.get("http://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
        driver.findElement(By.xpath("//ul[@class='_114Zhd']/li[1]//span[contains(text(),'Samsung')]")).click();        
        System.out.println(driver.getTitle());

        
}
@AfterMethod
public void tearDown()
{
	driver.quit();
}

}
