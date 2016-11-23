package trygetgethubjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {
	
	@Test
	public void testmethod(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
		driver.navigate().to("https://gmail.com/");
		driver.findElement(By.id("Email")).sendKeys("sonam.sharma2407@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("abcd");
		driver.findElement(By.id("signIn")).click();
	
	}

}
