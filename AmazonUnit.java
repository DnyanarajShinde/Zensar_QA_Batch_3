package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonUnit {
	private WebDriver driver;
	private String baseURL;
	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		baseURL="https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseURL);
		
		driver.findElement(By.xpath(".//*[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath(".//*[@id=\'ap_email\']")).sendKeys("9021370596");
		driver.findElement(By.xpath(".//*[@id=\'continue\']")).click();
		driver.findElement(By.xpath(".//*[@id=\'ap_password\']")).sendKeys("dnyanu5678");
		driver.findElement(By.xpath(".//*[@id=\'signInSubmit\']")).click();
		driver.findElement(By.xpath(".//*[@id=\'twotabsearchtextbox\']")).sendKeys("Earphones");
		driver.findElement(By.xpath(".//*[@id=\'nav-search-submit-button\']")).click();
//		driver.findElement(By.xpath(".//*[@id=\'a-autoid-2-announce\']")).click();
//		driver.findElement(By.xpath(".//*[@id=\'s-result-sort-select_4\']")).click();
//		driver.findElement(By.xpath(".//*[@id=\'p_n_is_cod_eligible/4931671031\']")).click();
		driver.findElement(By.xpath(".//*[@id=\'nav-item-signout\']")).click();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

}
