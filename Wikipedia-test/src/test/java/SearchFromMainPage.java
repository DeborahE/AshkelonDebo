import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchFromMainPage extends TestBase
{

    @Test
    public void searchFromMainPage()
    {
        click(By.cssSelector("input#searchInput"));
        driver.findElement(By.cssSelector("input#searchInput")).clear();
        String search = "Chocolat";
        driver.findElement(By.cssSelector("input#searchInput")).sendKeys(search);

        click(By.cssSelector("button.pure-button"));
    }
}
