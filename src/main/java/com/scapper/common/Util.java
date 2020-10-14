/**
 * 
 */
package com.scapper.common;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Moksh
 *
 */
public class Util
{
   
   /**
    * Custom fluent wait 
    * 
    * See {@link org.openqa.selenium.support.ui.FluentWait}
    * 
    * @param locator
    * @param driver
    * @param timeout
    * @param polling
    * @return
    * @throws InterruptedException
    */
   public static WebElement fluentWait(final By locator, final WebDriver driver, final int reties, final int waitSecs) throws InterruptedException {
      int ii = 0;
      while(ii < reties) {
         List<WebElement> allEle = driver.findElements(locator);
         if (allEle.size() > 0)
         {
            return allEle.get(0);
         }
         Thread.sleep(waitSecs*1000);
         ii++;
      }
      return null;
   }
   
	public static void createAndWriteInFile(StringBuffer sb, String fileName) {
		Charset utf8 = StandardCharsets.UTF_8;
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName), utf8)) {
		    writer.append(sb);
		    writer.close();
		    System.out.println("File " + fileName + " written.");
		} catch (IOException e) {}
	}

}