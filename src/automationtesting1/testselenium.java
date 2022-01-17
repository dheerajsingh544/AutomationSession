package automationtesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class testselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\3pg.itgroup\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		SoftAssert softAssert= new SoftAssert();
		 
		//driver1=new FirefoxDriver();
		//launch the website
		driver.get("https://www.google.co.in/");
		String title=driver.getTitle();
		System.out.println("validation start");
		Assert.assertEquals(title,"Google"," wrong title hai");
		
		System.out.println("validation for element start");
		
		WebElement element=driver.findElement(By.name("btnK"));
		Assert.assertTrue(element.isEnabled(),"wrong element hai");
		
		driver.quit();
		//softAssert.assertAll();
		
		//step 3: find search button  and type
		//WebElement searchText=driver.findElement(By.name("q"));
		//searchText.sendKeys("make my trip");
		//driver.findElement(By.name("btnk")).click(); 
		//searchText.sendKeys(Keys.ENTER);
		
		//driver.get("https://demoqa.com/automation-practice-form"); 
		
		//driver.findElement(By.id("submit")).submit();
		
		
		

	}

}
