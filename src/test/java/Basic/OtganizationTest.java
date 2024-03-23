package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OtganizationTest {
	
	@Test
	public void OrgTest() {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8888/");
	}

}
