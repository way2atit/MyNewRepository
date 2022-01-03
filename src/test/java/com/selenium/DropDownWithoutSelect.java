package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		
		WebElement dropele =driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
		dropele.click();
		
		
		
		
		Thread.sleep(1000);
		
		
		List<WebElement> all_lang =driver.findElements(By.xpath("//multi-select/div[2]/ul/li/a"));
		
		for(WebElement langelem : all_lang)
		{
			String lang =langelem.getText();
			System.out.println(lang);
			
			if(lang.equals("Hindi"))
			{
				langelem.click();
			}
			if(lang.equals("Italian"))
			{
				langelem.click();
			}
			
			if(lang.equals("Vietnamese"))
			{
				langelem.click();
			}
			
		}
		
		
		
		
		
		
		Thread.sleep(4000);
		driver.close();
		

	}

}
