import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Select s=new Select(driver.findElement(By.xpath("//span//select[2]")));
		s.selectByIndex(1);
		driver.findElement(By.xpath("//span//select[2]"));
		
		driver.close();
		}
		}
		
		/*s.selectByIndex(2);
		driver.findElement(By.xpath("//span//select[2]"));
		s.selectByVisibleText("May");
		driver.findElement(By.xpath("//span//select[2]"));
		*/
		
	


		 /*
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo' and @class='paxinfo']")).getText());
		//driver.findElement(By.xpath("//div[@id='divpaxinfo' and @class='paxinfo']")).click();
		
		Thread.sleep(3000);
		
		/*
		int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("//div[@class='ad-row-right']//span[3]")).click();
			i++;
		}
		
		Thread.sleep(3000);
		
		for(int j=1;j<5;j++)
			 {
			driver.findElement(By.xpath("//div[@id='divChild']//div[2]//span[3]")).click();
		}
		
	driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		
	System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo' and @class='paxinfo']")).getText());
	*/
