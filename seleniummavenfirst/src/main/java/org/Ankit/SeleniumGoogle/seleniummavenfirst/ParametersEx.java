package org.Ankit.SeleniumGoogle.seleniummavenfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx 
{
	@Parameters({"url","jobType","city"})
	@Test
	public void searchJob (String url, String jobType, String city) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get(url);
		
		driver.findElement(By.xpath(".//*[@id='text-input-what']")).sendKeys(jobType);
		driver.findElement(By.xpath(".//*[@id='text-input-where']")).sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
		driver.findElement(By.xpath(".//*[@id='text-input-where']")).sendKeys(city);
		driver.findElement(By.xpath(".//*[@id='whatWhere']/form/div[3]/button")).click();
		Thread.sleep(2000);
		driver.close();
		}
}
