package com.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Logout {
	WebDriver driver;
	@Test
	public void Logoutpage()
	{
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
	}

}