import java.util.HashSet;
import java.util.Set;

import com.scapper.common.Scraper;
import com.scapper.udemy.UdemyCoursesScraper;

public class Main {

	/**
	 * Change this path as per chromedriver.exe location
	 * 
	 * You can download latest driver from here:
	 * {@link https://chromedriver.chromium.org/downloads}
	 */
	private static final String chromeDriverPath = "driver//chromedriver.exe";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//		Scraper scraper = new UdemyCoursesScraper();
	}

}
