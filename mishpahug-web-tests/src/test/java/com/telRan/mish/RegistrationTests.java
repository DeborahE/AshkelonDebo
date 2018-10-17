package com.telRan.mish;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @BeforeMethod
    public void preCondition(){
        wd.manage().deleteAllCookies();

    }

    @AfterMethod
    public void postCondition(){
        logOut();
    }


    @Test
    public void registerFromHeaderTest(){
        String myEmail= "etr+" +System.currentTimeMillis()+"@gmail.com";
        System.out.println(myEmail);

        String password = "a123456";
        System.out.println(password);

        clickOnCreateAccountButtonOnHeader();

        FillCreateAccountForm(myEmail, "a123456", "a123456");

        ClickOnRegistrationButton();

        Assert.assertTrue(wd.findElement(By.xpath("//img[@id='borderRadius']")).isDisplayed());
    }


    @Test
    public void registrationFromLoginForm() throws InterruptedException {
        String myEmail= "etr+" +System.currentTimeMillis()+"@gmail.com";
        System.out.println(myEmail);

        String password = "a123456";
        System.out.println(password);

        clickOnLoginButtonOnHeader();
        OpenCreateAccountForm(); //cliquer sur alt + enter et creer
        Thread.sleep(2000);
        FillCreateAccountForm(myEmail, "a123456", "a123456");
        //clickOnCreateAccountButtonOnHeader();


    }

    public void OpenCreateAccountForm() {
        wd.findElement(By.xpath("//span[contains(text(),'Registration')]")).click();
    }

    public void clickOnLoginButtonOnHeader() {
        wd.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
    }

    @Test
    public void registrationFromCreateEvent(){

    }
}
