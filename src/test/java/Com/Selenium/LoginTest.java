package Com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest 
{
	WebDriver driver;
	public LoginTest(WebDriver driver)
	{
		this.driver=driver;
	}
private String URL="https://www.amazon.in/";
private By signin=By.linkText("Sign in");
private By email=By.id("ap_email");
private By next=By.id("continue");
private By pass=By.id("ap_password");
private By submit=By.id("signInSubmit");

 public void Login() { driver.get(URL); driver.findElement(signin).click();;
 driver.findElement(email).sendKeys("9843683229");
driver.findElement(next).click();
 driver.findElement(pass).sendKeys("MyPass@123");
 driver.findElement(submit).click(); 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }


 
	/*
	 * public void Login(String stremail,String strpass) { driver.get(URL);
	 * driver.findElement(signin).click();;
	 * driver.findElement(email).sendKeys(stremail);
	 * driver.findElement(next).click(); driver.findElement(pass).sendKeys(strpass);
	 * driver.findElement(submit).click(); }
	 */

}