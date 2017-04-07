package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBaiduOps {

	@Test
	public void visintBaidu(){
		System.out.println("testbaidu");
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.baidu.com");
	}
}
