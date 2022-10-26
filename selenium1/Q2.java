//Q2. Write a script launch the IE browser and open https://www.google.com/ URL.

package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Q2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\software\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.close();

	}
}
