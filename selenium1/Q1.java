//Write a script to open the Firefox browser and open https://www.google.com/ URL.

package selenium1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.google.com");
		driver.close();

	}

}
