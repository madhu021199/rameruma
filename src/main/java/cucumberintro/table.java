package cucumberintro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class table {

	@Test()
	public void get() {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		for (WebElement row : rows) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
			String row_text=columns.get(1).getText();
			if(row_text.equalsIgnoreCase("man")) {
				columns.get(3).findElement(By.tagName("input")).click();
			}
		}
	}
}
