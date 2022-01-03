package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrpDownExample {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(1000);
		WebElement dropelem =driver.findElement(By.xpath("//table/tbody/tr[10]/td[2]/select"));		
		Select s1 = new Select(dropelem);
	
		System.out.println(	s1.isMultiple());
		
		
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(3);
		Thread.sleep(2000);
		
		//s1.deselectAll();
		//s1.deselectByIndex(1);
		//s1.deselectByValue("");
	//	s1.deselectByVisibleText("");
		
		
		WebElement firstselectelem=s1.getFirstSelectedOption();
	//	System.out.println(firstselectelem.getText());
		
		/*List<WebElement> alloptions=s1.getOptions();
		for(WebElement e:alloptions)
		{
			System.out.println(e.getText());
		}*/
		
		List<WebElement> allselectOption=s1.getAllSelectedOptions();
		for(WebElement e:allselectOption)
		{
			System.out.println(e.getText());
		}
		
		
		
		
		
		
		
		
		
		
		/// --------------------------------
		/*driver.get("http://demo.automationtesting.in/Register.html");

		
		WebElement dropelem=  driver.findElement(By.id("Skills"));
		Select s = new Select(dropelem);
	//	s.selectByIndex(4);
		//s.selectByValue("Art Design");
		s.selectByVisibleText("Certifications");
		
		System.out.println(s.isMultiple());
		
		
		
		*/
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
