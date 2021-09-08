package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowAutomation {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		baseURL="https://in.bookmyshow.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Test
	public void test() {
		driver.get(baseURL);
		
		driver.findElement(By.xpath(".//*[@id=\'modal-root\']/div/div/div/div[1]/div/div/input")).sendKeys("Pune");
		driver.findElement(By.xpath(".//*[@id=\'wzrk-cancel\']")).click();
		driver.findElement(By.xpath(".//*[@id=\'modal-root\']/div/div/div/div[1]/div[1]/div[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id=\'modal-root\']/div/div/div/div[1]/div[2]/div/ul/li")).click();
		driver.findElement(By.xpath(".//*[@id=\'4\']")).click();
		driver.findElement(By.xpath(".//*[@id=\'super-container\']/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("Shershaah");
		driver.findElement(By.xpath(".//*[@id=\'super-container\']/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/ul/li/div/div[2]/span/strong")).click();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
	
}
