package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Git {

	public WebDriver d1;

	@Test
	public void test()
	{
		d1.findElement(By.xpath("//input[@type='email']")).sendKeys("rajesh");
		d1.findElement(By.xpath("//input[@name='pass']")).sendKeys("rajesh123");
		d1.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("rajesh");
	}
	@BeforeTest 
	public void middle()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		d1 =new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d1.manage().window().maximize();
		d1.get("https://www.facebook.com/");
		System.out.println("chinna");
	}
	@AfterTest 
	public void end()
	{
		d1.close();
		System.out.println("innominds");
	}

}
