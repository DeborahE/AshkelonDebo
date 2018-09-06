import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchFromMainPage extends TestBase
{

    @Test
    public void searchFromMainPage()
    {
        app.getSessionHelper().click(By.cssSelector("input#searchInput"));
        app.driver.findElement(By.cssSelector("input#searchInput")).clear();
        String search = "Chocolat";
        app.driver.findElement(By.cssSelector("input#searchInput")).sendKeys(search);

        app.getSessionHelper().click(By.cssSelector("button.pure-button"));
    }
}
