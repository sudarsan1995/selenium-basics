import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ExerciseFromLectures {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(4000);
		// driver.switchTo().alert().accept();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//table[@class='calendar']//following-sibling::tbody//tr[2]//td[@class=' ui-datepicker-days-cell-over undefined selected']")).click();

		Select adult1 = new Select(driver.findElement(By.id("Adults")));
		adult1.selectByIndex(4);
		WebElement variable = adult1.getFirstSelectedOption();
		String SelectedText = variable.getText();
		Assert.assertEquals(SelectedText, "5");
		System.out.println("Selected Value is" + SelectedText);
		
		 Select children = new Select(driver.findElement(By.id("Childrens")));
		 children.selectByValue("3");
		 children.getFirstSelectedOption();
		 System.out.println("Selected value is" +children.getFirstSelectedOption().getText());
		 
		 Select infants = new Select(driver.findElement(By.id("Infants")));
		 infants.selectByVisibleText("1");
		 infants.getFirstSelectedOption();
		 System.out.println("Selected value is" +infants.getFirstSelectedOption().getText());
		  
		  driver.findElement(By.id("MoreOptionsLink")).click(); Select ClassofTravel =
		  new Select(driver.findElement(By.cssSelector("select[id='Class']")));
		  ClassofTravel.selectByValue("First");
		  
		 String Preferredairline = "Indigo";
		  
		 driver.findElement(By.name("airline")).sendKeys(Preferredairline);
		  driver.findElement(By.id("SearchBtn")).click();
		 System.out.println(driver.findElement(By.xpath(
		  "//div[@id='homeErrorMessage']")).getText());
		  
		 driver.close();
		 
	}

}
