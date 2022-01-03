package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MosueHandlingEx extends AppConstant {
	
	public static void main(String[] args) throws InterruptedException {
		
		 driver = browserInit();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 
		 WebElement fashionelem =driver.findElement(By.xpath("//*[text()=\"Fashion\"]"));
		 WebElement mobilelem =driver.findElement(By.xpath("//div[text()=\"Mobiles\"]"));
		 
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(fashionelem).perform();
		 
		// act.contextClick(fashionelem).build().perform();
		 
		 //contextClick :  Right Click
		 
		// act.clickAndHold(mobilelem).build().perform();
		 Thread.sleep(2000);
		 act.release().build().perform();
		 
		
		 
		 
		
		 
		 
		 Thread.sleep(4000);
		 driver.close();
		 
		 
		 
	}

}
