import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20237/eng-vs-rsa-match-1-icc-cricket-world-cup-2019");

			WebElement tablelist=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
			int rowcount=tablelist.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
			int columncount=tablelist.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
			
			for(int i=0;i<columncount-2;i++)
			{
				String totalvalue=tablelist.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				int number=Integer.parseInt(totalvalue);
				total=total+number;
				
				
			}

			System.out.println(total);
			
			String includingextra=driver.findElement(By.xpath("//div[text()='Extras']//following-sibling::div[1]")).getText();
			int number1=Integer.parseInt(includingextra);
			int number2=total+number1;
			System.out.println(number2);
			
			String totaloftotal=driver.findElement(By.xpath("//div[text()='Total']//following-sibling::div[1]")).getText();
			int number3=Integer.parseInt(totaloftotal);
			
			if(number3==number2)
			{
				System.out.println("Matches");
			}
			else
			{
				System.out.println("Not macthed");
			}
			
			
	}
	

}
