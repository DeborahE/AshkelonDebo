import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchFromLangMainPage extends TestBase
{

    @Test
    public void searchFromLangMainPage()
    {
        clickOnFrenchLink();
        String search = "Kinder";

        type( By.cssSelector("input#searchInput"), search);

        click(By.cssSelector("input#searchButton.searchButton"));
    }



}
