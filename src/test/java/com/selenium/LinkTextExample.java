package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkTextExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/link.html");
		
		
	//	driver.findElement(By.linkText("click here")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Telecom")).click();
		
		
		
		Thread.sleep(4000);
		driver.close();

	}

}
