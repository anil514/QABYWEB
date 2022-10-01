package selenium.test;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTest {
	private static WebDriver driver;
	
	public static void waitForElementPresent(By locator, int waitTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		WebElement element= null;
		try {
			element = driver.findElement(locator);
		}catch(Exception e) {
			System.out.println("Exception Occured..");
			System.out.println(e.getMessage());
		}
		return element;		
	}
	
	public void doActions(By locator, String text) {
		Actions act = new Actions(driver);
		WebElement ele = getElement(locator);
		act.sendKeys(ele, text).perform();
	}
	
	public void doActionsClick(By locator, String text) {
		Actions act = new Actions(driver);
		WebElement ele = getElement(locator);
		act.click(ele).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); 
		driver.findElements(By.tagName("a"));
		Thread.sleep(10);
		//Static wait
				//it will paushe the code for specific time
				//not recomened in selenium
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Applied for all the elements
				//global wait
				//Dynamic wait
				//Default time is 0ms
				//Applied for only elemenst(findElement() and findElements() methods)
				//NoSuchElementException, if elemnet not found within time
		
		By email = By.id("email");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.presenceOfElementLocated(email));
		//Default time: 500ms
		//internally polling mechanism available
		// 3 secs apply - if element not found, every 500ms it will check
		//(tried for 3 seconds with 500 milliseconds interval)		
		// -- We can handle we elements and other non web elements like title
		WebElement emailId = driver.findElement(email);
		emailId.sendKeys("test");
		 wait.until(ExpectedConditions.titleContains("test"));
		 System.out.println(driver.getTitle());
		 
		 waitForElementPresent(email, 10);
		 
		 
		 Actions act = new Actions(driver);
		 act.sendKeys(emailId, "text").perform();
		 act.dragAndDrop(emailId, emailId);
		 
		 String parent = driver.getWindowHandle();
		 Set<String> all = driver.getWindowHandles();
		 Iterator<String> it = all.iterator();
		
		 while(it.hasNext()) {
			 String child =  it.next();
			 if(!parent.equals(child)) {
				 driver.switchTo().window(child);
				 driver.close();
			 }
			 driver.switchTo().window(parent);
		 }
		 
		 Select s = new Select(emailId);
		 s.deselectAll();
		 
		 
		driver.close();
	}

}
