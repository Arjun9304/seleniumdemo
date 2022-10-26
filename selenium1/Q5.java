//Write a script to get the title of the “Contact Us” page.

package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.tothenew.com");
		WebElement contactus = driver.findElement(By.xpath("(//a[text()='contact us'])[2]"));
		contactus.click();
		System.out.println(driver.getTitle());
		driver.close();

}
}
