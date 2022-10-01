package selenium.test;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String par = driver.getWindowHandle();
		WebElement ele = driver.findElement(By.id(""));
		ele.click();
		Set<String> all = driver.getWindowHandles();
		Iterator<String> it = all.iterator();
		while(it.hasNext()){
		String ch =  it.next();
		if(!ch.equals(par)){
		driver.switchTo().window(ch);
		driver.close();
		}
		}
		driver.switchTo().window(par);
		if(ele.isSelected() == false) {
		ele.click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.ignoring(Exception.class);
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated((By.id("val"))));
	}

}
