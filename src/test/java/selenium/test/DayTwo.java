package selenium.test;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DayTwo {
	
	
	@Test(groups = { "demo" }, dependsOnMethods = "")	
	public void gh() {
		
	}

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.navigate().to("http://www.google.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ele = driver.findElement(By.id("id"));
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('id').value = 'value'");
		js.executeScript("history.go(0)");
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		js.executeScript("window.scrollBy(0, 700)");
		
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		driver.findElement(By.id("id")).getCssValue("font-size");
		System.out.println(list.size());
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "(user.dir) +/screenshot/img.png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(file, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");
		alert.getText();
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.contextClick(ele);
		act.clickAndHold().build().perform();
		act.doubleClick(ele);
		
		String parent = driver.getWindowHandle();
		ele.click();
		Set<String> set = driver.getWindowHandles();
		set.iterator();
		try {
			Connection con = DriverManager.getConnection("url",  "", "");
			Statement st = con.createStatement();
			ResultSet res = st.executeQuery("");
			System.out.println(res);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame(1);
		driver.switchTo().defaultContent();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.presenceOfElementLocated((By) ele));
		wait.until(ExpectedConditions.elementToBeSelected(ele));
		wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		List<WebElement> bo = driver.findElements(By.id(""));
		bo.get(5).click();
		for(int i = 0; i<list.size(); i++) {
			String val = bo.get(i).getText();
			if(val.equals("result")) {
				bo.get(i).click();
				break;
			}
			
		}
	
	}

}
