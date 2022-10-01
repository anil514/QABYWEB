package selenium.test;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.className(""));
		Actions actr = new Actions(driver);
		actr.doubleClick(ele).perform();
		driver.switchTo().frame(5);
		driver.switchTo().frame("frame name");
		List<WebElement> list = driver.findElements(By.id(""));
		for(WebElement s : list) {
			s.getText();
			 
		}
		List<WebElement>list1 = driver.findElements(By.xpath("/html/body/div/div/main/div[2]/div/div/a"));
		int count = list1.size();
		System.out.println("list count: "+count);		
		String last = list1.get(count-1).getText();
		System.out.println("last index name: "+last);
		list1.get(count-1).click();
		
		
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("path"));
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.ignoring(Exception.class).pollingEvery(Duration.ofSeconds(10))
				.withTimeout(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(ele)));
		Select s = new Select(ele);
		s.selectByIndex(1);
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.close();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String src1 = ".path";
		File f = new File(src1);
		FileUtils.copyFile(file, f);
		ele.getScreenshotAs(OutputType.FILE);
		
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		Iterator<String> it = all.iterator();		
		while(it.hasNext()) {
			String ch = it.next();
			driver.switchTo().window(ch);
			if(!parent.equals(ch)) {
				driver.close();
			}
		}
		
		
		
		
		
	}
		
	}


