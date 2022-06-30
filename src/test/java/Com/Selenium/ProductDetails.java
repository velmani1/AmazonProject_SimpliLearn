package Com.Selenium;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetails {
	WebDriver driver;
	public ProductDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	public static By menu =By.linkText("Electronics");
	public static By procat =By.linkText("Cameras");
	public static By link=By.partialLinkText("Tripod & Ringligjhts");
    public static By products=By.xpath("//div[@id=\"octopus-dlp-asin-stream\"]/ul/li]"); 
	public static By prodname=By.xpath("//div[@class='a-section octopus-dlp-asin-title']");
	public static By prodprice=By.xpath("//span[@class='a-price-whole']");
	public static By offer=By.xpath("//div[contains(@class,'a-size-mini oct-deal-badge-element oct-deal-badge-label')]");
	public static By search=By.id("twotabsearchtextbox");
	public static By search1=By.id("nav-search-submit-button");
	public static By check=By.className("a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left");
	public static By check1 = By.linkText("Woodland");
	public String pname;
	String pprice;
	String poff;
	Connection con;
	Statement statement;
	List<WebElement> product=products.findElements(driver);
	List<WebElement> name=prodname.findElements(driver);
	List<WebElement> price=prodprice.findElements(driver);
	List<WebElement> off=offer.findElements(driver);
	
	int n=product.size();
    
    
	public void productList(WebDriver driver)
	{
		driver.findElement(menu).click();
		driver.findElement(procat).click();
		driver.findElement(link).click();
	}
	public void Search(WebDriver diver)
	{
		
		driver.findElement(search).sendKeys("mens slippers");
		
	   WebElement el= (WebElement) driver.findElements(check);
	   el.click();
	   System.out.println("all checked");
	   
	    ((WebElement) check1).click();
	    System.out.println("one checked");
	    driver.findElement(search1).click();
	    
	}
	
	public void getProducts(WebDriver driver)
	{
		for(int l=0; l<n; l++)
		  {
			
	  for(int i=0; i<name.size(); i++)
	  { 
	 pname=name.get(i).getText();
	  }
	  for(int j=0; j<price.size(); j++) 
	  {
		pprice=price.get(j).getText();
		
	  } 
	 
		for(int k=0; k<off.size(); k++)
		{ 
		 poff=off.get(k).getText();
		
		}
	}
	
	}
}
	  
        
      


