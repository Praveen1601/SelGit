package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDay1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GOD\\eclipse-workspace\\SelProj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		WebElement sel = driver.findElement(By.id("email"));
		sel.sendKeys("praveen");
		System.out.println("kumar");
	}

}
