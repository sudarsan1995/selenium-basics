import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//div[@class='RNNXgb']//div//div[2]//input[@name='q']")).sendKeys("Paris");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='RNNXgb']//div//div[2]//input[@name='q']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='RNNXgb']//div//div[2]//input[@name='q']")).sendKeys("Paris");
		driver.findElement(By.xpath("//div[@class='RNNXgb']//div//div[2]//input[@name='q']")).sendKeys(Keys.ENTER);
	
		Thread.sleep(2000);

		
		WebElement source=driver.findElement(By.xpath("//div[@class='RNNXgb']//div//div[2]//input[@name='q']"));
		Thread.sleep(2000);
		source.sendKeys("Paris");
		source.clear();
		source.sendKeys("Paris");
		Thread.sleep(4000);
		
		
		
		for(int i=0;i<4;i++)
		{
			source.sendKeys(Keys.ARROW_DOWN);
		}
		Thread.sleep(3000);
		source.sendKeys(Keys.ENTER);
	}

}
