package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver() ;
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("sandhya511") ;
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("san511") ;
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
		Thread.sleep(2000) ;
		
		
	}
}
