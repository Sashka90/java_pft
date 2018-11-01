package ru.stqa.pft.agtsite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;


public class AssertPersonInfo {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAssertPersonInfo() throws Exception {
        driver.get("https://agt.qiwi.com/");
        driver.findElement(By.cssSelector("div.sc-jKJlTe.hHYJIW")).click();
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Якушев Александр Иванович [11816160]'])[2]/following::span[2]")).getText(), "Агент");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ОСМП'])[1]/following::span[2]")).getText(), "Роли");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Роли'])[1]/following::span[2]")).getText(), "Телефон");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Телефон'])[1]/following::span[2]")).getText(), "E-mail");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            assertEquals(driver.findElement(By.cssSelector("div.sc-hMqMXs.jlBnCN")).getText(), "Якушев Александр Иванович [11816160]");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


}

