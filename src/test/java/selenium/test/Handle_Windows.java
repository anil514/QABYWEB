package selenium.test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		String parId = driver.getWindowHandle();
		driver.findElement(By.id("")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			String child = it.next();
			if (!child.equals(parId)) {
				driver.switchTo().window(child);
				driver.close();
			}
		}
		driver.switchTo().window(parId);

		// frams
		driver.switchTo().frame(1);
		driver.switchTo().frame("frameName");
		driver.switchTo().defaultContent();
		// Actions class
		WebElement ele = driver.findElement(By.id(""));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		act.contextClick(ele);
		act.doubleClick(ele);
		WebElement src = driver.findElement(By.id(""));
		WebElement trt = driver.findElement(By.id(""));
		act.dragAndDrop(src, trt);

		// Inner Join -- fetch both tables matching data
		// select * from table1 INNER JOIN table2 ON table1.columnName =
		// table2.columnName

		/*
		 * TRUNCATE, Drop and Delete TRUNCATE: -> DDL commend -> it is used remove all
		 * the records from table -> rollback not possible -> TRUNCATE Table tableName
		 * Delete: -> DML commend -> We can delete a single record or multiple records
		 * depending on the condition specified in the query. -> Rollback possible ->
		 * Delete from tableName where columnName = 7; //Drop: -> DDL -> it deletes the
		 * data of the table as well as removes the entire schema/structure of the table
		 * from the database. -> where clause not available -> Rollback not possible ->
		 * DROP Table tableName
		 */

		/*
		 * GIT: git init git branch branchName git checkout -b branchNAme changes made
		 * git status git add . git commit -m "message" git push origin branchNmae
		 */

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated((By) ele));

		FluentWait<WebDriver> wa = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		wa.until(ExpectedConditions.elementToBeClickable(ele));
		
		Alert al = driver.switchTo().alert();
		String par = driver.getWindowHandle();
		ele.click();
		Set<String> all = driver.getWindowHandles();
		Iterator<String> it1 = all.iterator();
		while(it1.hasNext()){
		String ch = it1.next();
		if(!ch.equals(par)){
		driver.switchTo().window(ch);
		driver.close();
		}
		driver.switchTo().window(par);
		}
		List<WebElement> li = driver.findElements(By.tagName("//"));
		for(WebElement s : li) {
			if(s.getText().equals("")){
				System.out.println("broken link");
			}else {
				System.out.println(s.getText());
			}
		}
		
		for(WebElement e : li) {
			if(e.getText().equals("text")) {
				e.click();
			}
		}

	}

}
