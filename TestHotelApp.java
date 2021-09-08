package test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.WebElement;

public class TestHotelApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\Drivers\\chromedriver.exe");	//Set path for chrome driver
		WebDriver driver=new ChromeDriver();
		//driver.get("https://adactinhotelapp.com/");
		//driver.navigate().to("https://adactinhotelapp.com/");
		String baseURL="https://adactinhotelapp.com/";
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		
		//login page
		driver.findElement(By.id("username")).sendKeys("DnyanarajSinde");
		driver.findElement(By.id("password")).sendKeys("dnyanu5678");
		driver.findElement(By.id("login")).click();
		
		//search hotel
		Select loc=new Select(driver.findElement(By.id("location")));
		loc.selectByVisibleText("Sydney");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loc.selectByIndex(5);
		
		Select hotel=new Select(driver.findElement(By.id("hotels")));
		hotel.selectByVisibleText("Hotel Sunshine");
		
		Select room_type=new Select(driver.findElement(By.id("room_type")));
		room_type.selectByIndex(1);
		
		Select room_no=new Select(driver.findElement(By.id("room_nos")));
		room_no.selectByIndex(1);
		
		driver.findElement(By.id("datepick_in")).sendKeys("06/09/2021");
		
		driver.findElement(By.id("datepick_out")).sendKeys("07/09/2021");
		
		Select room_adult=new Select(driver.findElement(By.id("adult_room")));
		room_adult.selectByIndex(1);
		
		Select room_child=new Select(driver.findElement(By.id("child_room")));
		room_child.selectByIndex(1);
		
		//driver.findElement(By.id("Reset")).click();
		
		driver.findElement(By.id("Submit")).click();
		
		//Select a Hotel
		WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
        radio.click();
        
        driver.findElement(By.id("continue")).click();
        
        //Book a Hotel
        driver.findElement(By.id("first_name")).sendKeys("Dnyanaraj");
        
        driver.findElement(By.id("last_name")).sendKeys("Shinde");
        
        driver.findElement(By.id("address")).sendKeys("Suva Point Apartments, Suva, Fiji");
        
        driver.findElement(By.id("cc_num")).sendKeys("1234567891234567");
        
        Select cc_type=new Select(driver.findElement(By.id("cc_type")));
		cc_type.selectByIndex(1);
		
		Select sel_month=new Select(driver.findElement(By.id("cc_exp_month")));
		sel_month.selectByIndex(1);
		
		Select sel_year=new Select(driver.findElement(By.id("cc_exp_year")));
		sel_year.selectByIndex(12);
		
		driver.findElement(By.id("cc_cvv")).sendKeys("1234");
		
		driver.findElement(By.id("book_now")).click();
		
		//Confirmation Page
		driver.findElement(By.id("my_itinerary")).click();
		
		//My Itinerary Page
//		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox'] [@value='453492']"));
//	    check.click();
//	    
//	    WebElement c = driver.findElement(By.xpath("//input[@type='submit'] [@value='Cancel Selected']"));
//	    c.click();
		
		driver.findElement(By.id("order_id_text")).sendKeys("9009P3O63D");
		
		driver.findElement(By.id("search_hotel_id")).click();
		
		driver.findElement(By.id("btn_id_453495")).click();
		
		driver.switchTo().alert().accept();
		
		//Logout from application
		driver.findElement(By.id("logout")).click();
		
		driver.close();
	}

}
