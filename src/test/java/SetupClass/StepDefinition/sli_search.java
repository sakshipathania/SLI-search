package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.lang.String;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import SetupClass.Set;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sli_search extends Set{
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	  JavascriptExecutor js = (JavascriptExecutor) driver;


	@Given("^Open the website URL\\.$")
	public void open_the_website_URL() throws Throwable {
		driver.get(AppURL);
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	log.info("It's opening the website URL");
	Thread.sleep(1000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
	driver.get("https://www.slideteam.net");
	Thread.sleep(2000);
    driver.manage().deleteAllCookies();
    Thread.sleep(2000);
	try {
		driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
		Thread.sleep(2000);
		log.info("It's opening the website URL");
	} 
	catch (NoSuchElementException popup) {
	}
			WebElement old_paid_email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[2]/div/input")));
    old_paid_email.sendKeys("sakshi.pathania@slidetech.in");
    
    WebElement old_paid_pass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[2]/div[2]/form/fieldset/div[3]/div/input")));
    old_paid_pass.sendKeys("Qwerty@1");
		
		 WebElement old_paid_login_btn=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.login > span:nth-child(1)")));
	    old_paid_login_btn.click();

	

	/*@Then("^enter a keyword to search//.$")
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
			js.executeScript("alert('Product Suggestion Box did not appeared after Keyword Removal');");
                             }
		driver.navigate().refresh(); Thread.sleep(3800);

	                }
	}*/
		
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
		
		Select Sort =  new Select(driver.findElement(By..cssSelector("#dk0-combobox")));
					  
		Thread.sleep(3000);
		//WebElement Sort= driver.findElement(By.cssSelector("#dk0-combobox"));
		//Thread.sleep(3000);
		//Sort.click();
		Sort.selectByVisibleText("Newest");
		
		//Select Newest = new Select(driver.findElement(By.id("dk0-https://www.slideteam.net/search/go?lbc=slideteam&method=and&p=Q&ts=custom&uid=516718103&w=hr%20annual%20report&isort=newest"))); 
			//Thread.sleep(3000);
	         //Newest.click();
			
		Thread.sleep(3000);
					  
		Select Sort1 =  new Select(driver.findElement(By..cssSelector("#dk0-combobox")));
					  
		Thread.sleep(3000);
		Sort1.selectByVisibleText("Popularity");
			
		Thread.sleep(3000);
					  
		Select Sort2 =  new Select(driver.findElement(By..cssSelector("#dk0-combobox")));
					  
		Thread.sleep(3000);
		Sort2.selectByVisibleText("Most Popular");
					   Thread.sleep(3000);
			/*WebElement Sort1 = driver.findElement(By.cssSelector("#dk0-combobox"));
		Thread.sleep(3000);
		Sort1.click();
		Thread.sleep(3000);
			
		WebElement Popularity = wait.until(ExpectedConditions.elementToBeClickable(By.id("dk0-https://www.slideteam.net/search/go?lbc=slideteam&method=and&p=Q&ts=custom&uid=516718103&w=hr%20annual%20report"))); 
			Thread.sleep(3000);
	         Popularity.click();
			Thread.sleep(3000);	
		
		WebElement Most_downloaded = wait.until(ExpectedConditions.elementToBeClickable(By.id("dk0-https://www.slideteam.net/search/go?lbc=slideteam&method=and&p=Q&ts=custom&uid=516718103&w=hr%20annual%20report&isort=downloaded"))); 
			Thread.sleep(3000);
	         Most_downloaded.click();
			Thread.sleep(3000);*/	
		
		WebElement Stage = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#facet-stages > li:nth-child(2) > input[type=checkbox]")));
		
			Thread.sleep(3000);
	                 Stage.click();
			Thread.sleep(3000);
		
		WebElement Category = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("sli_unselected")));
		
			Thread.sleep(3000);
	                 Category.click();
			Thread.sleep(3000);
		
		String str = driver.findElement(By.cssSelector("#sli_content_wrapper > div:nth-child(3) > div > div > div.toolbar-amount.sli_num_results > span.toolbar-number.sli_current_page_value")).getText();
		
		}
		}
		

