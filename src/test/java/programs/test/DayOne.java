package programs.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class DayOne {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * Alert alert = driver.switchTo().alert(); alert.accept(); alert.dismiss();
		 * alert.getText(); alert.sendKeys("");
		 */
		//
		/*
		 *  FluentWait<WebDriver> fw = new
		 * FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(5));
		 */
//self joint: nothing but inner join
		//select * from table1 a, table2 b where a.cloumnName =  b.columnName;
		
		//
		/*
		 * int a = 0, b = 1, c; for(int i =0; i<10; i++) { c = a + b;
		 * System.out.println(c); a = b; b = c; }
		 */
		/*
		 * HashMap hm = new HashMap(); hm.put(1, "One"); hm.put(2, "Two"); hm.put(3,
		 * "Three"); hm.put(4, "Four"); System.out.println(hm.get(3)); Set s =
		 * hm.keySet(); System.out.println(s); Collection cc = hm.values();
		 * System.out.println(cc);
		 */
		String st = "regegr";
		String[] sp = st.split("");
		for(int i =0; i<sp.length; i++) {
			for(int j = i+1; j<sp.length; j++) {
				if(sp[i].equals(sp[j])) {
					String d = sp[i];
					System.out.println(d);
				}
			}
		}
		
		int[] a={20,10,25,12,36};
		Arrays.sort(a);
		for(int i : a) {
			System.out.println(i);
		}
		
		//list to Array
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		al.add("test1");
		al.add("test2");
		al.add("test3");
		String[] stg = new String[al.size()];
		for(int i = 0; i<al.size(); i++) {
			stg[i] = al.get(i);
		}
		for(String s : stg) {
			System.out.println(s);
		}
		
		//array to list
		int[] in={20,10,25,12,36};
		ArrayList<Integer> an = new ArrayList<Integer>();
		for(Integer ie : in) {
			an.add(ie);
		}
		System.out.println(an);
		
	}

}
