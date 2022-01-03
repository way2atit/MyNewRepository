package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement fnametxt =driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		fnametxt.clear();
		fnametxt.sendKeys("kajal");
		
		
		WebElement lnametxt =driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lnametxt.clear();
		lnametxt.sendKeys("Abc");
		
		WebElement maleradiobtn =driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		maleradiobtn.click();
		
		
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
		
		
		driver.findElement(By.name("submitbtn")).click();
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		
	}

}
