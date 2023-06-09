package com.example.testing8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class Task4 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();
    	ChromeOptions co = new ChromeOptions();
    	co.addArguments("--remote-allow-origins-*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("source"));
		src.sendKeys("Coimbatore");
		WebElement des = driver.findElement(By.id("destination"));
		des.sendKeys("Hosur");
		WebElement date = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguuments[0].setAttribute('value',03/06/2023)",date);
		
	
		
    }
}
