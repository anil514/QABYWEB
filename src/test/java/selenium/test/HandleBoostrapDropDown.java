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
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBoostrapDropDown {

	public static void main(String[] args) throws SQLException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        ChromeDriver driver = new ChromeDriver(options);
		//String projectPath =System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/ChromeDriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-secondary dropdown-toggle']"));
		btn.click();
		//JavascriptExecutor js1 = ((JavascriptExecutor)driver);
		//js1.executeScript("arguments[0].scrollIntoView(true);", btn);
		List<WebElement>list = driver.findElements(By.xpath("/html/body/div/div/main/div[2]/div/div/a"));
		int count = list.size();
		System.out.println("list count: "+count);		
		String last = list.get(count-1).getText();
		System.out.println("last index name: "+last);
		list.get(count-1).click();
		
		/*
		 * for(int i=0; i<list.size(); i++) { System.out.println(list.get(i).getText());
		 * if(list.get(i).getText().equals("Another action")) { list.get(i).click();
		 * break; } }
		 */
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "//src";
		File pa = new File(path);
		try {
			FileUtils.copyFile(src, pa);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.ignoring(Exception.class);
		wait.pollingEvery(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(null));
		FluentWait<WebDriver> ff = new FluentWait<WebDriver>(driver)
				.ignoring(Exception.class)
				.pollingEvery(Duration.ofSeconds(4))
				.withTimeout(Duration.ofSeconds(5));
		ff.until(ExpectedConditions.elementToBeClickable(btn));
		Actions act = new Actions(driver);
		act.contextClick(btn);
		//tagname[@attaributeName='attributeValue']/following::input
				//	Xpath=//*[@type=’password’]//following::input
		Alert alert = driver.switchTo().alert();
		alert.accept();
		alert.dismiss();
		alert.sendKeys(path);
		alert.getText();
		Connection con = DriverManager.getConnection("DBURL", "Username", "Password");
		Statement st = con.createStatement();
		ResultSet set = st.executeQuery("query");
		System.out.println(set);
		

	}

}