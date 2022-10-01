package capgemini.prep;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserSize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Dimension d = new Dimension(750, 400);
		driver.manage().window().setSize(d);
		
		//
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.resizeTo(450, 630);");
		
		//
		int hi = driver.manage().window().getSize().height;
		int we = driver.manage().window().getSize().width;
		
		// 
		Point p = new Point(2, 3);
		driver.manage().window().setPosition(p);
		
		String par = driver.getWindowHandle();
		WebElement el = driver.findElement(By.id(""));
		Set<String> all = driver.getWindowHandles();
		Iterator<String> it = all.iterator();
		while(it.hasNext()) {
			String child = it.next();
			if(!par.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
			}			
		}
		driver.switchTo().window(par);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Actions act = new Actions(driver);
		act.click(el);
		act.clickAndHold(el).moveToElement(el).release();
		act.moveToElement(el, hi, we);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.getText();
		al.sendKeys("");
		
		

	}

}
