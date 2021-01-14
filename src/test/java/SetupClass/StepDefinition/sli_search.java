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
	//driver.get("https://www.slideteam.net");
	//Thread.sleep(2000);
	//driver.get("https://www.slideteam.net");
	//Thread.sleep(2000);
    driver.manage().deleteAllCookies();
    Thread.sleep(2000);
	try {
		driver.findElement(By.cssSelector(".authorization-link > a:nth-child(1)")).click();
		Thread.sleep(2000);
		log.info("It's opening the website URL");
	} 
	catch (NoSuchElementException popup) {
	}
	
		
			Thread.sleep(4000);
		 WebElement search_btnn = wait.until(ExpectedConditions.elementToBeClickable(By.id("search-input")));
		  Thread.sleep(2000);
		  search_btnn.sendKeys("HR"); 
		  Thread.sleep(4000);
		  
		  
		  
		  WebElement search_1n =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_products"))); 
		  Thread.sleep(2000); 
		  String text00=search_1n.getText(); 
		  System.out.println(text00); 
		  Thread.sleep(3000);
		  
		  String actual_text00="Product Suggestions for Hr Interview ";
		  
		  if(text00.equalsIgnoreCase(actual_text00)) {
		  log.info("product suggestion tab header is displayed correctly "); 
		  }
		  
		  WebElement prod_suggn =wait.until(ExpectedConditions.elementToBeClickable(By.className("sli_ac_section"))); 
		  Thread.sleep(2000); 
		  String pro_sugg_locn=prod_suggn.getText();
		  System.out.println("product suggestion list name is ----"+pro_sugg_locn);
		  
		  WebElement parent_productn =wait.until(ExpectedConditions.elementToBeClickable(By.className("productList"))); 
		  Thread.sleep(2000);
		  System.out.println("classname  of parent is ----------------------->"+parent_productn);
		   
		Thread.sleep(4000);
		  WebElement View_More = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sli_autocomplete > div > div.sli_ac_products > div > div.view-more-link > a"))); 
			Thread.sleep(3000);
			View_More.click();
			Thread.sleep(5000);
			
			Thread.sleep(3000);
		
		
		
		WebElement Sort= driver.findElement(By.cssSelector("#sli_content_wrapper > section.product-list-wrapper.sli_generic_container > div.container.sli_generic_container > div > div.right-col.sli_generic_container > div > div.form-group.sort-selection.sli_sorts > form > span > span.selection > span > span.select2-selection__arrow > b"));
		js.executeScript("arguments[0].scrollIntoView();",Sort);
		Thread.sleep(3000);
		Sort.click();
		
		WebElement Newest =  driver.findElement(By.xpath("//*[text()='Newest']"));
			Thread.sleep(3000);
	         Newest.click();
			Thread.sleep(8000);	
					
					  
	
	      WebElement Sort1 = driver.findElement(By.cssSelector("#sli_content_wrapper > section.product-list-wrapper.sli_generic_container > div.container.sli_generic_container > div > div.right-col.sli_generic_container > div > div.form-group.sort-selection.sli_sorts > form > span > span.selection > span > span.select2-selection__arrow > b"));
		js.executeScript("arguments[0].scrollIntoView();",Sort1);
		Thread.sleep(3000);
		Sort1.click();
		
			
		WebElement Popularity = driver.findElement(By.xpath("//*[text()='Popularity']")); 
			Thread.sleep(3000);
	         Popularity.click();
			Thread.sleep(3000);	
		
		 WebElement Sort2 = driver.findElement(By.cssSelector("#sli_content_wrapper > section.product-list-wrapper.sli_generic_container > div.container.sli_generic_container > div > div.right-col.sli_generic_container > div > div.form-group.sort-selection.sli_sorts > form > span > span.selection > span > span.select2-selection__arrow > b"));
		js.executeScript("arguments[0].scrollIntoView();",Sort2);
		Thread.sleep(3000);
		Sort2.click();
		
		WebElement Most_downloaded = driver.findElement(By.xpath("//*[text()='Most Downloaded']")); 
			Thread.sleep(3000);
	         Most_downloaded.click();
			Thread.sleep(3000);
		
		WebElement Category = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/div/section[2]/div[2]/span/div[1]/ul/li[1]/a)));
		
			Thread.sleep(3000);
	                 Category.click();
			Thread.sleep(3000);
		
		WebElement Stage = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#facet-stages > li:nth-child(3)")));
		js.executeScript("arguments[0].scrollIntoView();",Stage);
			Thread.sleep(3000);
	                 Stage.click();
			Thread.sleep(3000);
		
		String str = driver.findElement(By.cssSelector("#sli_content_wrapper > section.product-list-wrapper.sli_generic_container > div.container.sli_generic_container > div > div.left-col.sli_generic_container > div > div > span.sli_result_set_after_prefix")).getText();
		 System.out.println("Total Number of Products ----"+str);
		Thread.sleep(3000);
				driver.navigate().refresh(); Thread.sleep(3800);
		}
		}
		

