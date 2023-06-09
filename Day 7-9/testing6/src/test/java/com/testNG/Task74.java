package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task74 {

	WebDriver driver ;
	@BeforeMethod
	public void openUrl()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin") ;
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		String curl=driver.getCurrentUrl();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" ;
		if(url.equals(curl))
		{
			System.out.println("Login Success") ;
		}
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		driver.findElement(By.name("Abmelden")).click();
		String rurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String urls = driver.getCurrentUrl();
		if(rurl.equals(urls))
		{
			System.out.println("Logout successful") ;
		}
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
