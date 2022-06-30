//package Com.Selenium;
//
//
//import java.util.List;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class TestSelenium {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		
//			//driver.findElement(By.id("nav-link-accountList-nav-line-1"));
//			//driver.findElement(By.linkText("Sign in")).click();
//			//driver.findElement(By.id("ap_email")).sendKeys("9843683229");
//			//driver.findElement(By.id("continue")).click();
//			//driver.findElement(By.id("ap_password")).sendKeys("Pass@123");
//			//driver.findElement(By.id("signInSubmit")).click();
//			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			driver.findElement(By.linkText("Electronics")).click();
//			driver.findElement(By.linkText("Cameras")).click();
//			driver.findElement(By.partialLinkText("Tripod & Ringligjhts")).click();
//			//List<WebElement> elementName=driver.findElements(By.xpath("//div[@class='a-section octopus-dlp-asin-title']"));
//			
//		         
//			/*
//			 * System.out.println("Number of elements:" +elementName.size());
//			 * 
//			 * for(int i=0; i<elementName.size(); i++){ String
//			 * productName=elementName.get(i).getText();
//			 * System.out.println("product Name is"+"" + productName); }
//			 */
//			/*
//			 * List<WebElement>
//			 * element=driver.findElements(By.xpath("//span[@class='a-icon-alt']"));
//			 * System.out.println("Number of elements:" +element.size()); for(int i=0;
//			 * i<element.size(); i++){ WebElement rating=element.get(i);
//			 * System.out.println("product Rating is"+"" + rating); }
//			 */
//			
//			/*
//			 * List<WebElement>
//			 * price=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
//			 * System.out.println("Number of elements:" +price.size()); for(int
//			 * i=0;i<price.size(); i++) { String prodprice=price.get(i).getText();
//			 * System.out.println("product price is"+"" + prodprice);
//			 * 
//			 * }
//			 */
//				/*
//				 * try { driver.manage().window().wait(1000); } catch (InterruptedException e) {
//				 * // TODO Auto-generated catch block e.printStackTrace(); }
//				 */
//			  
//			  List<WebElement> numOff=driver.findElements(By.xpath("//span[contains(@class,'a-size-mini')]"));
//			  for(int i=0; i<numOff.size(); i++)
//			  { 
//				  String offer=numOff.get(i).getText();
//			  System.out.println("product offer% is"+"" + offer); 
//			  }
//			 
//		       
//		        
//			}
//	}
//			
//	
//
//		