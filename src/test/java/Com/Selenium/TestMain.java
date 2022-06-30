package Com.Selenium;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
	static LoginTest logtest; 
	static ProductDetails details;
	static ConnectDB db;
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		logtest=new LoginTest(driver);
		details=new ProductDetails(driver);
		db=new ConnectDB();
		logtest.Login();
		details.productList(driver);
		details.getProducts(driver);
		db.insertProducts(details);
		db.select(details);
		details.Search(driver);
		
		}

}
