import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exerciseOnDynamicSuituation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
	    String selectedoption=driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label[1]")).getText();
	   
		
	    WebElement DropdownOption=driver.findElement(By.id("dropdown-class-example"));
	    
		Select dropdown=new Select(DropdownOption);
		dropdown.selectByVisibleText(selectedoption);
		
		driver.findElement(By.name("enter-name")).sendKeys(selectedoption);
		driver.findElement(By.id("alertbtn")).click();
		
		String alertmessage=driver.switchTo().alert().getText();
		
		if(alertmessage.contains(selectedoption))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
			
		driver.close();		
			}
	
		}
		