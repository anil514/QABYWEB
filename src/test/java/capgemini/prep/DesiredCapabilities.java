package capgemini.prep;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities {
	
	
	
	public static void main(String[] args) throws IOException {
		/*
		 * DesiredCapabilities caps = DesiredCapabilities.firefox();
		 * caps.setCapability("platform", "Windows 10"); caps.setCapability("version",
		 * "92"); caps.setCapability("build", myTestBuild); caps.setCapability("name",
		 * myTestName); WebDriver driver = new RemoteWebDriver(new URL(cloudUrl), caps);
		 */
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		opt.setAcceptInsecureCerts(true);
		opt.setPlatformName("win 10");
		opt.setBrowserVersion("93");
		opt.setHeadless(true);
		
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.cookies", 2);
		opt.setExperimentalOption("prefs", prefs);
				
		
		
		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("build", 1);
		hm.put("name", 2);
		opt.setCapability("hm:options", hm);
		WebDriver driver = new RemoteWebDriver(new URL(""), opt);
		driver = new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String p = "";
		File f1 = new File(p);
		FileUtils.copyFile(f, f1);
		
		FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver)
				.ignoring(Exception.class).pollingEvery(Duration.ofSeconds(1))
				.withTimeout(Duration.ofSeconds(1));	
	}

}
