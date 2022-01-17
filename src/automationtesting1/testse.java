package automationtesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\3pg.itgroup\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		//driver1=new FirefoxDriver();
		//launch the website
		driver.get("https://integration.test.getsemo.com/");
		WebElement searchText=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/main/div[2]/div/div/button[1]"));
		searchText.click();

	}

}
