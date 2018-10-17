package com.telRan.mish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeClass
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        wd = new ChromeDriver(options.addArguments("--disable-notifications"));

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        wd.navigate().to("https://mish.sheygam.com/#/wellcome");

    }

    @AfterClass
    public void tearDown(){
        wd.quit();

    }

    public void ClickOnRegistrationButton() {
        wd.findElement(By.xpath("//span[contains(.,'Registration')]")).click();
    }

    public void FillCreateAccountForm(String myEmail, String password, String passwordRep) {

        type( By.cssSelector("[formcontrolname=email]"),myEmail) ;
        type(By.cssSelector("[formcontrolname=password]"), password);
        type(By.cssSelector("[formcontrolname=passwordRep"), passwordRep);

        // ces 3 lignes sont supprime grace a la methode type qui nous permet de reunir les 3 fonctions.

       // wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).click();
        //wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).clear();
        //wd.findElement(By.cssSelector("[formcontrolname=passwordRep")).sendKeys(passwordRep);
    }

    public void type( By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void clickOnCreateAccountButtonOnHeader() {
        wd.findElement(By.cssSelector("a.paddingLeft.hover.but.mat-button:last-child")).click();
    }

    public void logOut() {
        clickOnHamburgerButton();
        clickOnLogOutButton();
    }

    public void clickOnLogOutButton() {
        wd.findElement(By.xpath("//span[contains(text(),'Log out')]")).click();

    }

    public void clickOnHamburgerButton() {
        wd.findElement(By.cssSelector("button [mattooltip='Menu']")).click();
    }
}
