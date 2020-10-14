/**
 * !! IMPORTANT READ !!
 * PLEASE READ COMMENTS AND COMPLETE THE CLASS ELEMENTS BEFORE RUNNING THIS CLASS
 * 
 * IMPORTANT COMMENTS ON LINE NUMBERS:
 * LINE 30
 * LINE 46
 * LINE 51
 * LINE 56
 * LINE 63
 * LINE 88
 * LINE 93
 * 
 */

package com.scapper.udemy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.scapper.common.Course;
import com.scapper.common.Scraper;
import com.scapper.common.Util;

public class UdemyCoursesScraper implements Scraper {

	@Override
	public Map<String, Course> scrap() {
		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
//		HtmlUnitDriver driver =  new HtmlUnitDriver();
//		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(PageVariables.BASE_URL);
		List<WebElement> courses = driver.findElements(PageVariables.coursesBy);
		Map<String, Course> courseInfo = new HashMap<String, Course>();
		
		
		for (int page = 1; page <= courses.size(); page++) {
			String pageUrl = PageVariables.BASE_URL + page;
			driver.get(pageUrl);
			WebElement table = Util.fluentWait(PageVariables.parentDivBy, driver, 10, 2);
			List<WebElement> trList = table.findElement(PageVariables.tableBy).findElements(By.tagName("tr"));
			int totalRows = trList.size();
			getPageData(driver, pageUrl, totalRows, 0);
		}
		return null;
	}
	
	public static void getPageData(WebDriver driver, String pageUrl, int totalRows, int rowNo) throws InterruptedException {
		driver.get(pageUrl);
		WebElement table = Util.fluentWait(PageVariables.parentDivBy, driver, 10, 2);
		List<WebElement> trList = table.findElement(PageVariables.tableBy).findElements(By.tagName("tr"));
		writeRowAndHistoryDataOnFile(driver, trList.get(rowNo));
		rowNo++;
		if(rowNo < totalRows)
			getPageData(driver, pageUrl, totalRows, rowNo);
	}

	public static void writeRowAndHistoryDataOnFile(WebDriver driver, WebElement tr) throws InterruptedException {
		List<WebElement> tdList = tr.findElements(By.tagName("td"));
		StringBuffer coinData = new StringBuffer();
		StringBuffer rowData = new StringBuffer();
		for (WebElement td : tdList) {
			String tmp = td.getText().replace("\n", " ");
			rowData.append(tmp);
			rowData.append(",");
		}
		coinData.append(rowData);
		coinData.append("\n\n");
		String linkUrl = tdList.get(2).findElement(By.tagName("a")).getAttribute("href");
		getCoinHistory(driver, linkUrl + HISTORY_URL, coinData);
		String fileName = OUTPUT_PATH + linkUrl.substring(linkUrl.lastIndexOf("/") + 1, linkUrl.length()) + ".txt";
		System.out.println("fileName:"+fileName);
		Util.createAndWriteInFile(coinData, fileName);
	}

	public static void getCoinHistory(WebDriver driver, String url, StringBuffer coinData) throws InterruptedException {
		System.out.println("loading history url:"+url);
		driver.get(url);
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
		System.out.println("loaded history url");
		WebElement historyTable = Util.fluentWait(historicaltableBy, driver, 10, 2);
		List<WebElement> historyTrList = historyTable.findElement(PageVariables.tableBy).findElements(By.tagName("tr"));
		System.out.println("step2");
		for (WebElement tr : historyTrList) {
			List<WebElement> tdList = tr.findElements(By.tagName("td"));
			StringBuffer sbt = new StringBuffer();
			for (WebElement td : tdList) {
				String tmp = td.getText();
				sbt.append(tmp);
				sbt.append(",");
			}
			coinData.append(sbt);
			coinData.append("\n");
			System.out.println("step3");
		}
	}

	public static int getTotalPages(WebDriver driver) {
		WebElement paginationUL = driver.findElement(paginationBy);
		List<WebElement> liList = paginationUL.findElements(By.tagName("li"));
		return Integer.parseInt(liList.get(liList.size() - 2).getText());
	}



	@Override
	public void store(Map<String, Course> courseDetail) {
		// TODO Auto-generated method stub
		
	}

}