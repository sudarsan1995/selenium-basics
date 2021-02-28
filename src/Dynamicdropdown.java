import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='dropdownDiv']//ul/li[7]//a")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("///div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@text='Chennai (MAA)']]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Coimbatore (CJB)']]")).click();
		
	
	
	}
	
	

}
