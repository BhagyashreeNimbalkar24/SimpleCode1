package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationTest {
	
	
	
	@Test
	public void CreateOrganizationsTest() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		
		//Click on Organization
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		//Click on Create Organization..(+)
		driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
		
		//In AssignedTo Click on Group
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		
		
		
		
		
	}

}
