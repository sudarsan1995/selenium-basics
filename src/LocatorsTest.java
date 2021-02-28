import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("https://in.yahoo.com/?p=us");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//driver.navigate().back();
		
		//Below code is to sendkeys to the textbox
		
		driver.findElement(By.cssSelector("#username")).sendKeys("Suadrsan"); 
		driver.findElement(By.name("pw")).sendKeys("9600704490");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText("Please check your username and password. If you still can't log in, contact your Salesforce administrator."));
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		//driver.navigate().back();
	}

}
