package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddNewContact {
    private WebDriver wd;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testAddNewContact() throws Exception {
        wd.get("http://localhost/addressbook/group.php");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("user")).sendKeys(Keys.TAB);
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//input[@value='Login']")).click();
        wd.findElement(By.linkText("add new")).click();
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys("Alex");
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys("Ivanovich");
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys("Yakushev");
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys("Sashka90");
        wd.findElement(By.name("title")).click();
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys("NewContact");
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys("QIWI");
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys("4ertanovo");
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys("Strogino");
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys("1111111");
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys("1111111");
        wd.findElement(By.name("fax")).clear();
        wd.findElement(By.name("fax")).sendKeys("2222222");
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys("1@1.ry");
        wd.findElement(By.name("email2")).clear();
        wd.findElement(By.name("email2")).sendKeys("2@2.ru");
        wd.findElement(By.name("email3")).clear();
        wd.findElement(By.name("email3")).sendKeys("0");
        wd.findElement(By.name("homepage")).clear();
        wd.findElement(By.name("homepage")).sendKeys("-");
        wd.findElement(By.name("bday")).click();
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText("20");
        wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[22]")).click();
        wd.findElement(By.name("bmonth")).click();
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText("May");
        wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[1]/following::option[39]")).click();
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys("1990");
        wd.findElement(By.name("new_group")).click();
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("test1");
        wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Group:'])[1]/following::option[2]")).click();
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]")).click();
        wd.findElement(By.linkText("Logout")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        wd.quit();

    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }


}
