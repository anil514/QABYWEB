package capgemini.prep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep_01 {

	public static void main(String[] args) throws IOException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incoigno");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "/path";
		File p = new File(path);
		FileUtils.copyFile(file, p);
		WebElement el = driver.findElement(By.id(""));
		Actions ac = new Actions(driver);
		ac.contextClick();
		ac.clickAndHold(el).release(el);
		Boolean b = el.isSelected();
		
		Properties pr = new Properties();
		FileInputStream ip = new FileInputStream("");
		pr.load(ip);
		pr.getProperty("");
		pr.setProperty("", "");
		
		
		

	}

}
