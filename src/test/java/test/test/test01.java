package test.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test01 {
	
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver = new ChromeDriver();
		WebElement el = driver.findElement(By.id(""));
		Actions ac = new Actions(driver);
		ac.click(el);
		ac.contextClick(el);
		ac.clickAndHold(el).release(el).build().perform();
		ac.moveToElement(el);
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 120)");
		js.executeScript("arguments[0].scrollIntoView(true);", el);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Alert al = driver.switchTo().alert();
		

	}

}
