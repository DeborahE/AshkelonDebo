import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase
{

    WebDriver driver;

    @BeforeClass

    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.wikipedia.org/");

        Thread.sleep(3000);
    }



    @AfterClass

    public void tearDown()
    {
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickOnFrenchLink() {
        click(By.cssSelector("a#js-link-box-fr"));
    }

    public void type(By locator,String search) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(search);
    }

    public void clickOnEnglishLink() {
        click(By.cssSelector("a#js-link-box-en"));
    }

    public void clickOnEspagnolLink() {
        click(By.cssSelector("a#js-link-box-es"));
    }


    public void clickOnRussianLink() {
        click(By.cssSelector("a#js-link-box-ru"));
    }

    public void clickOnChinsesLink() {
        click(By.cssSelector("a#js-link-box-zh"));
    }

    public void clickOnPortuguesLink() {
        click(By.cssSelector("a#js-link-box-pt"));
    }

    public void clickOnItalianLink() {
        click(By.cssSelector("a#js-link-box-it"));
    }

    public void clickOnDeutchLink() {
        click(By.cssSelector("a#js-link-box-de"));
    }

    public void clickOnJapaneseLink() {
        click(By.cssSelector("a#js-link-box-ja"));
    }

    public void returnToPreviousPage() {
        driver.navigate().back();
    }
}
