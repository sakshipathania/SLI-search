package SetupClass.StepDefinition;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sli_search extends Set {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	  JavascriptExecutor js = (JavascriptExecutor) driver;


	@Given("^Open the website URL//.$")
	public void Open_the_website_URL() throws Throwable {
		driver.get(AppURL);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	log.info("It's opening the website URL");
	Thread.sleep(1000);
	
          driver.manage().deleteAllCookies();
          Thread.sleep(2000);
	 }

	@Then("^enter a keyword to search//.$")
	public void enter_a_keyword_to_search() throws Throwable {
		
		 for(int i=0; i<=4; i++) {
	
		  WebElement search_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search")));
		  Thread.sleep(2000);
		  search_btn.sendKeys("Org Chart"); 
		  Thread.sleep(4000);
		  
		  WebElement search_1 =wait.until(ExpectedConditions.elementToBeClickable(By.id("sli_ac_section_products"))); 
		  Thread.sleep(2000); 
		  String text1=search_1.getText(); 
		  System.out.println(text1); 
		  Thread.sleep(3000);
		  
		  String actual_text1="Product Suggestions for Hr Interview ";
		  
		  if(text1.equalsIgnoreCase(actual_text1)) {
		  log.info("product suggestion tab header is displayed correctly "); }
		  
		  WebElement prod_sugg =wait.until(ExpectedConditions.elementToBeClickable(By.id("sli_raclist_products"))); 
		  Thread.sleep(2000); 
		  String pro_sugg_loc=prod_sugg.getText();
		  System.out.println("product suggestion list name is ----"+pro_sugg_loc);
		  
		  WebElement parent_product =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list"))); 
		  Thread.sleep(2000);
		  System.out.println("classname  of parent is ----------------------->"+parent_product);
		
		  Thread.sleep(4000);
	
		  WebElement search_btn1 = driver.findElement(By.cssSelector("#search"));
		  Thread.sleep(2000);
		  search_btn1.sendKeys(Keys.CONTROL + "a");
                  search_btn1.sendKeys(Keys.DELETE);
		  Thread.sleep(8000);
		
		
		if(driver.findElement(By.id("sli_raclist_products")).isDisplayed()){
			
                    System.out.println("Element is Visible");
			throw new IOException ("Element Should not be visible");
			
                        }  else {
                            System.out.println("Element is Not Visible");
                             }
		driver.navigate().refresh(); Thread.sleep(3800);

	                }
	}
		
		@Then("^Click on Sort//.$")
	        public void Click_on_Sort() throws Throwable {
			Thread.sleep(4000);
		 WebElement search_btnn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#search")));
		  Thread.sleep(2000);
		  search_btnn.sendKeys("HR"); 
		  Thread.sleep(4000);
		  
		  
		  
		  WebElement search_1n =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_section"))); 
		  Thread.sleep(2000); 
		  String text00=search_1n.getText(); 
		  System.out.println(text00); 
		  Thread.sleep(3000);
		  
		  String actual_text00="Product Suggestions for Hr Interview ";
		  
		  if(text00.equalsIgnoreCase(actual_text00)) {
		  log.info("product suggestion tab header is displayed correctly "); 
		  }
		  
		  WebElement prod_suggn =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list"))); 
		  Thread.sleep(2000); 
		  String pro_sugg_locn=prod_suggn.getText();
		  System.out.println("product suggestion list name is ----"+pro_sugg_locn);
		  
		  WebElement parent_productn =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_product_list"))); 
		  Thread.sleep(2000);
		  System.out.println("classname  of parent is ----------------------->"+parent_productn);
		   
		Thread.sleep(4000);
		  WebElement View_More = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sli_autocomplete > div > div.sli_ac_products > div > div.sli_view_more_link_wrapper > a"))); 
			Thread.sleep(3000);
			View_More.click();
			Thread.sleep(5000);
			
			Thread.sleep(3000);
		WebElement Sort= driver.findElement(By.cssSelector("#dk0-combobox"));
		Thread.sleep(3000);
		Sort.click();
			
		WebElement Newest = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dk0-https/:////www/.slideteam/.net//search//go/?lbc/=slideteam/&method/=and/&p/=Q/&ts/=custom/&uid/=516718103/&w/=hr/%20annual/%20report/&isort/=newest"))); 
			Thread.sleep(3000);
	         Newest.click();
			
		Thread.sleep(3000);
			
			WebElement Sort1 = driver.findElement(By.cssSelector("#dk0-combobox"));
		Thread.sleep(3000);
		Sort1.click();
		Thread.sleep(3000);
			
		WebElement Popularity = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dk0-https/:////www/.slideteam/.net//search//go/?lbc/=slideteam/&method/=and/&p/=Q/&ts/=custom/&uid/=516718103/&w/=hr/%20annual/%20report"))); 
			Thread.sleep(3000);
	         Popularity.click();
			
		Thread.sleep(3000);	
			
		}
		}
		

