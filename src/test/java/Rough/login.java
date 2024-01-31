package Rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

//import pages.actions.List;

public class login {
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement pimTab = driver.findElement(By.xpath("//a/span[text()='PIM']"));
		// admin.click();

		Actions action = new Actions(driver);
		action.click(pimTab).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Employee List')]")).click();
		System.out.println("clicked the emplistTab");
		Thread.sleep(2000);
		WebElement anc = driver
				.findElement(By.xpath("//label[contains(.,'Employee Name')]/../following-sibling::div//input"));
		anc.click();
		anc.sendKeys("ravi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		WebElement table = driver.findElement(By.xpath("//div[@class = 'oxd-table orangehrm-employee-list']"));

		// Find all the rows within the table
		List<WebElement> rows = table.findElements(By.xpath(".//div[@role = 'rowgroup']"));

		for (int i = 0; i < rows.size(); i++) {
			WebElement row = rows.get(i);

			// Find all the cells within the row
			List<WebElement> cells = row.findElements(By.xpath(".//div[@class = 'oxd-table-body']"));

			// Iterate over each cell and extract the text
			for (WebElement cell : cells) {
				String cellText = cell.getText();

				// If it's the first row, treat it as the header row
				if (i == 0) {
					// Process the header cell text
					System.out.println("Header: " + cellText);
				} else {
					// Process the data cell text
					System.out.println("Data: " + cellText);
				}
			}
		}

	}

}
