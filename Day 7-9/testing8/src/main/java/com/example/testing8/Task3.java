package com.example.testing8;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement value = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")) ;
		value.sendKeys("401");
		driver.findElement(By.name("submit")).click();
		Alert a = driver.switchTo().alert() ;
		Thread.sleep(2000);
		a.dismiss();
		value.clear();
		Thread.sleep(2000);
		value.sendKeys("402");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		a.accept();
		Alert b = driver.switchTo().alert();
		
		String text = b.getText();
		b.accept();
		System.out.println(text);
		driver.quit();
		
		
		
    }
}
