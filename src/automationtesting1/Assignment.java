package automationtesting1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\3pg.itgroup\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		//driver1=new FirefoxDriver();
		//launch the website
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//step 3: find search button  and type
		driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a")).click();
		WebElement searchText=driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
		searchText.sendKeys("Dheeraj");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		lastname.sendKeys("singh");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.sendKeys("dheerajsingh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();

		Select sel3=new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")));

		sel3.selectByVisibleText("2001"); 
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		
		WebElement mobile=driver.findElement(By.xpath("//*[@id=\"userNumber\"]"));
		mobile.sendKeys("8896962144");
		
//		WebElement subject=driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
//		subject.sendKeys("Assement on automation");
//		
		
//		WebElement currentaddress=driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
//		currentaddress.sendKeys("2/5 mohali india asia earth ");
//		
//		Select state=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div")));
//		state.selectByVisibleText("NCR");
//		
//		Select city=new Select(driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")));
//		city.selectByVisibleText("Delhi");
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.id("submit")).submit(); 
		//searchText.sendKeys(Keys.ENTER);

	}

}
