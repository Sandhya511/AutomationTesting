
package com.example.testing8;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task5
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement key=driver.findElement(By.name("q"));
		key.sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000) ;
		String tl = driver.getTitle();
		String idl = driver.getWindowHandle();
		System.out.println(tl);
		System.err.println(idl) ;
		
		//to open new tab
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement keys=driver.findElement(By.name("q"));
		keys.sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000) ;
		String tls = driver.getTitle();
		String idls = driver.getWindowHandle();
		System.out.println(tls);
		System.err.println(idls) ;
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement keye=driver.findElement(By.name("q"));
		keye.sendKeys("Cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000) ;
		String tle = driver.getTitle();
		String idle = driver.getWindowHandle();
		System.out.println(tle);
		System.err.println(idle) ;
		 
		
		
		
    }
}
