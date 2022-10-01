package capgemini.prep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicPopup {

	public static void main(String[] args) {
	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("--incognito");  
	    opt.setBrowserVersion("23");
	    opt.setHeadless(false);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		FluentWait<WebDriver> we = new FluentWait<WebDriver>(driver);
		we.pollingEvery(Duration.ofSeconds(10));
		we.ignoring(Exception.class);
		we.withTimeout(Duration.ofSeconds(10));
		try {
			Alert al = wait.until(ExpectedConditions.alertIsPresent());
			if(al == null) {
				System.out.println("No Alert");
			}else {
				driver.switchTo().alert().accept();
				driver.switchTo().alert().dismiss();
				driver.switchTo().alert().getText();
				driver.switchTo().alert().sendKeys("test");
			}
		}catch(NoAlertPresentException e){
			
		}
		WebElement el = driver.findElement(By.xpath("//div[@id = 'abc']"));
		String tx = el.getText();
		Select s = new Select(el);
		s.selectByIndex(1);
		List<WebElement> li = s.getOptions();
		
		for(int i =0; i<li.size(); i++) {
			s.selectByIndex(i);
		}
		s.deselectAll();
driver.switchTo().defaultContent();
driver.switchTo().frame(0);
driver.findElement(By.xpath("//*[name() = 'svg']//*[local-name() = 'tagname']"));
	}

}
