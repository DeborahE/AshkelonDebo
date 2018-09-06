import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private  SessionHelper sessionHelper;
    private LeftNavMenuHelper leftNavMenuHelper;
    private WelcomeHelper welcomeHelper;

    WebDriver driver;



    public void start() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.wikipedia.org/");

        Thread.sleep(3000);

        sessionHelper = new SessionHelper(driver);
        leftNavMenuHelper = new LeftNavMenuHelper(driver);
        welcomeHelper = new WelcomeHelper(driver);
    }

    public void stop() {
        driver.quit();
    }


    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public LeftNavMenuHelper getLeftNavMenuHelper() {
        return leftNavMenuHelper;
    }

    public WelcomeHelper getWelcomeHelper() {
        return welcomeHelper;
    }
}
