package auto;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.BrowsersType;



public class TestXXX {

   private WebDriver driver = null;	
	@Test
	public void testBs(){
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver = browser.driver;
		System.out.println("test126");
		driver.get("http://www.126.com");
	}
}
