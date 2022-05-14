package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eluma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//Getting the button's position
		WebElement buttonPosition = driver.findElement(By.id("position"));
		org.openqa.selenium.Point point = buttonPosition.getLocation(); 
		int buttonXAxis = point.getX();
		int buttonYAxis = point.getY();
		System.out.println(" X Axis is "+buttonXAxis+"\n"+ " Y Axis is "+buttonYAxis);
		
		//Getting the color of the button
		WebElement colorFinder = driver.findElement(By.id("color"));
		String color = 	colorFinder.getCssValue("background-color");
		System.out.println("Color of the button is "+color);
		
		//getting the size of the button
		WebElement buttonSize =  driver.findElement(By.id("size"));
		int height = buttonSize.getSize().getHeight();
		int width = buttonSize.getSize().getWidth();
		System.out.println("Height of the button is "+height +" "+"Width of the button is "+width);
		
		
	}

}
