package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Quiz {
	static WebDriver driver;

	@BeforeClass
	public void Initialize() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
	}

	@Test
	public void UserRegistration() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement SignInBtn = driver.findElement(By.xpath("//a[@class='login']"));
		SignInBtn.click();

		WebElement EmailTextBox = driver.findElement(By.xpath("//input[@id='email_create']"));
		EmailTextBox.sendKeys("chhotu1.tothenew.com");
		WebElement CreateAccountBtn = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		CreateAccountBtn.click();
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("Admin");

		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");

		WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginBtn.click();
		WebElement AdminMenu = driver
				.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
		AdminMenu.click();

		WebElement UserNameTextBox = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		UserNameTextBox.sendKeys("ck98");

		WebElement UserRoleBtn = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));
		UserRoleBtn.click();

		List<WebElement> UserRole = driver.findElements(By.xpath("//div[@role='option']"));
		UserRole.get(1).click();

		WebElement StatusBtn = driver
				.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
		StatusBtn.click();

		List<WebElement> Status = driver.findElements(By.xpath("//div[@role='option']"));
		Status.get(2).click();

		WebElement EmpDetails = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		EmpDetails.sendKeys("chhotu");

		WebElement SearchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		SearchBtn.click();

		WebElement verify = driver.findElement(By.xpath("(//*[text()='No Records Found']"));
		Assert.assertEquals(verify, "No Records Found");

	}

	public void VerifyEmployee() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		UserName.sendKeys("Admin");

		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("admin123");

		WebElement LoginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginBtn.click();

		WebElement AddButton = driver
				.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
		AddButton.click();

	}

	@AfterClass
	public void close() {
		driver.close();
	}

}
