package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MosueHandlingEx2 extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		 driver = browserInit();
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 Thread.sleep(2000);
		 
		 WebElement dragele =driver.findElement(By.xpath("//div[@id=\"products\"]//ul/li[2]/a"));
		 WebElement dropele =driver.findElement(By.xpath("//ol[@id=\"amt7\"]/li"));
		 
		
		 
		 Actions act = new Actions(driver);
		 act.dragAndDrop(dragele, dropele).perform();
		 
		
		 
		 Thread.sleep(4000);
		 driver.close();
		 
		 
		 
	}

}
