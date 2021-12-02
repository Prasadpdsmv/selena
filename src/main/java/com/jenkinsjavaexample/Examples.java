package com.jenkinsjavaexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Examples {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver96.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kotak.com/en/home.html");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//img[@class='em-img lazyloaded']")).click();
		//driver.findElement(By.xpath("//a[text()='Apply Now']")).click();
		//element not iteractable.
	
		WebElement elt=driver.findElement(By.xpath("//img[@class='em-img lazyloaded']"));
		
		Thread.sleep(2000);
		
		JavascriptExecutor jsext=(JavascriptExecutor)driver;
		
		jsext.executeScript("arguments[0].ScrollIntoView()", elt);
		Thread.sleep(2000);
		
		Actions acrt=new Actions(driver);
	
		acrt.contextClick(elt);
	
		

	}


}
