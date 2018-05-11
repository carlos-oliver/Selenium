package com.tcc.carlos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WD {
	
	private static WebDriver driver = null;
	
	private static WebDriverWait wait = null;
	
	public static WebDriver get(){
		
		if(driver == null){
		   driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		}
		return driver;
	}
	
	
	public static WebDriverWait getWait(){
		if (wait == null){
			wait = new WebDriverWait(get(), 15);
		}
		return wait;
	}
	

	public static void quit(){
		driver.quit();
		driver = null;
		wait = null;
	}
	
	public boolean oElementoEstaPresente(WebDriver driver, By selector){
		try {
			driver.findElement(selector);
			return true;
		} catch (NoSuchElementException e){
			return false;
		}
	}	

}
