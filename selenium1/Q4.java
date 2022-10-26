
//Write a script to open http://www.tothenew.com/  and then navigate to the contact us page using 1) XPath 2) ID
package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.tothenew.com");
		WebElement contactus = driver.findElement(By.xpath("(//a[text()='contact us'])[2]"));
		contactus.click();

	}
}
