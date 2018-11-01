package ru.stqa.pft.agtsite;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangeAgent1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new EdgeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testChangeAgent1() throws Exception {
    driver.get("https://agt.qiwi.com/");
    driver.findElement(By.cssSelector("i.anticon.anticon-down-circle")).click();
    driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]/div/div/i")).click();
    driver.findElement(By.xpath("//div[7]/div/div/div/div[2]/div/div/div/div/div/span")).click();
    driver.findElement(By.cssSelector("i.anticon.anticon-down-circle")).click();
    driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div[2]/div/div/i")).click();
    driver.findElement(By.xpath("//div[8]/div/div/div/div[2]/div/div/div/div/div/span")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
