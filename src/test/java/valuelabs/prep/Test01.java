package valuelabs.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test01 {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		driver.quit();
		WebElement el = driver.findElement(By.id(""));
		Select s = new Select(el);
		List<WebElement> l = s.getOptions();
		Alert al = driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys("");
		al.getText();
		String id = driver.getWindowHandle();
		Set<String> se = driver.getWindowHandles();
		Thread.sleep(100);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wi = new WebDriverWait(driver, Duration.ofSeconds(10));
		wi.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		
		FluentWait<WebDriver> ff = new FluentWait<WebDriver>(driver);
		ff.withTimeout(Duration.ofSeconds(10));
		ff.ignoring(Exception.class);
		ff.pollingEvery(Duration.ofSeconds(1));
		
		
		Class.forName("com.sql.jdbc.Driver");
		Connection con = DriverManager.getConnection("URL", "UsserName", "Password");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("");
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.title;");
			js.executeScript("document.getElementById('some id').value='someValue';");
			js.executeScript("arguments[0].scrollIntoView(true);", el);
			js.executeScript("window.scrollBy(0,600)");
	}

}
