package tetra.prep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapUse {
	
	public static HashMap<String, String> mapUse() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "admin123");
		hm.put("1", "test::admin123");
		hm.put("2", "cust::admin123");
		return mapUse();
	}
	
	public static void SeleniumOne() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println(mapUse());
		String value = mapUse().get("admin");
		driver.findElement(By.id("")).sendKeys(value);
	}
	public static void SeleniumTwo() throws InterruptedException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println(mapUse());
		String value1 = mapUse().get("1");  //test::admin123
		driver.findElement(By.id("username")).sendKeys(value1.split("::")[0]); //test
		driver.findElement(By.id("password")).sendKeys(value1.split("::")[1]); //admin123
		 //Waits
		Thread.sleep(10);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		
		FluentWait<WebDriver> ff = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(Exception.class)
				.pollingEvery(Duration.ofSeconds(3));
		ff.until(ExpectedConditions.elementToBeSelected(By.id("")));
		
		//Multi windos
		String par = driver.getWindowHandle();
		Set<String> li = driver.getWindowHandles();
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			String ch = it.next();
			if(!ch.equals(par)) {
				driver.switchTo().window(ch);
				driver.getTitle();
				driver.close();
			}
		}
		driver.switchTo().window(par);
		driver.switchTo().newWindow(WindowType.TAB);
		
		List<WebElement> list = driver.findElements(By.id(""));
		for(int i =0; i<list.size(); i++){
			String va = list.get(i).getText();
			}
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 250)");
		js.executeScript("document.getElemntById('idvalue').value('anil');");
		js.executeScript("document.getElementByxpath('//div[@id = 'name']').value = 'Anil';");
		WebElement btn = driver.findElement(By.id(""));
		js.executeScript("arguments[0].scrollIntoView(true);",btn);
		js.executeScript("argument[0].scrollIntoView(true);", btn);
		js.executeScript("window.scrollBy(0, 300)");
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		List<WebElement> url = driver.findElements(By.tagName("a"));
		List<WebElement>al = new ArrayList<WebElement>();
		for(int i =0; i<url.size(); i++) {
			if(url.get(i).getAttribute("href") != null) {
				al.add(url.get(i));
			}
			
		}
		for(int j =0; j<al.size(); j++) {
			HttpURLConnection con = (HttpURLConnection)new URL(al.get(j).getAttribute("href")).openConnection();
			int code = con.getResponseCode();
			con.disconnect();
		}
		HttpURLConnection con = (HttpURLConnection)new URL("").openConnection();
		con.connect();
		String response = con.getResponseMessage(); //ok
		con.disconnect();
		//System.out.println("After ALL:"+activeList.size());
		System.out.println("--->"+response);	
		
		Actions act = new Actions(driver);
		act.moveByOffset(125, 0);
		act.moveToElement(btn).contextClick();
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(125, 0)");
		
		JavascriptExecutor js1 =  (JavascriptExecutor)driver;
		js1.executeScript("document.getElementById('id').value('value');");
		js.executeScript("document.getElemntById('idvalue').value('anil');");
		WebElement e = driver.findElement(By.id(""));
		js.executeScript("arguments[0].click();", e	);
		js.executeScript("arguments[0].scrollIntoView(true);", e);
		js.executeScript("arguments[0].scrollIntoView(true);",btn);

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "";
		File tar = new File(path);
		FileUtils.copyFile(file, tar);
		Alert ale = driver.switchTo().alert();
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.SHIFT).sendKeys(Keys.ALT).build().perform();
		Keys.chord(Keys.ALT, Keys.SHIFT);
		Class.forName("jdbs.sql");
		Connection co = DriverManager.getConnection("URL@username:password", "Username", "Password");
		Statement st = co.createStatement();
		ResultSet rs = st.executeQuery("Select * from table1");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
		}
		FileInputStream ip = new FileInputStream(new File ("path"));
		//creating workbook instance that refers to .xls file  
	HSSFWorkbook wb=new HSSFWorkbook(ip); 
		//creating a Sheet object to retrieve the object  
		HSSFSheet sheet=wb.getSheetAt(0);  
		Iterator<Row> itr = sheet.iterator();
		//Cell cell = cellIterator.next();  
		
		List<WebElement> a = new ArrayList<WebElement>();
		List<WebElement> l = driver.findElements(By.tagName("a"));
		for(int i =0; i<l.size(); i++) {
			if(l.get(i).getAttribute("href") != null) {
				a.add(l.get(i));
			}
		}
		for(int j =0; j<a.size(); j++) {
			HttpURLConnection hu = (HttpURLConnection)new URL(a.get(j).getAttribute("href")).openConnection();
			hu.connect();
			hu.getResponseCode();
			hu.getResponseMessage();
		}
	}

}
