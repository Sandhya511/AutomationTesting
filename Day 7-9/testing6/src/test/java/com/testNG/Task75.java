package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task75 {
	
	WebDriver driver ;
	@BeforeMethod
	public void openUrl()
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void title()
	{
		String title = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN" ;
		String actualTitle = driver.getTitle();
		if(title.equals(actualTitle)) {
			System.out.println("Title Validated") ;
		}
		driver.quit();
	}
	
	@Test
	public void search() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("Domains")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("Domain Name Search")).click();
//		System.out.println(driver.getTitle());
	}
//	@Test
//	public void domain() throws InterruptedException
//	{
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.name("Domains")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.name("Domain Name Search")).click();
//		String dname="GoDaddy Domain Search - Buy and Register Available Domain Names";
//		String dmname=driver.getTitle();
//		if(dname.equals(dmname))
//		{
//			System.out.println("Domain title validated") ;
//		}
//		WebElement sbox = driver.findElement(By.name("searchText")) ;
//		String box = "searchText" ;
//		if(box.equals(sbox))
//		{
//			System.out.println("Search box is present") ;
//		}
//		WebElement buy = driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/div[2]/button")) ;
//		String buyn = buy.getAriaRole();
//		String actbuy = "Buy It" ;
//		if(actbuy.equals(buyn))
//		{
//			System.out.println("Buy It is present") ;
//		}
//		
//		sbox.sendKeys("Dhrithi") ;
//		buy.click();
//		WebElement avail = driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[1]/div/div/text()[2]")) ;
//		String avi = avail.getText();
//		String uavi = "Unavailable" ;
//		if(uavi.matches(avi))
//		{
//			System.out.println("Domain not available");
//		}
//		else
//		{
//			System.out.println("Domain is available") ;
//			
//		}
		
	//}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
}
