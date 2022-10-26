// Write a script to search the “To The New” string in google.

package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement textbox= driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("to the new"+Keys.ENTER);
		driver.close();
	}

}



