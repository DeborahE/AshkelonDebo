import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchFromLangMainPage extends TestBase
{

    @Test
    public void searchFromLangMainPage()
    {
        app.getWelcomeHelper().clickOnFrenchLink();
        String search = "Kinder";

        app.getSessionHelper().type( By.cssSelector("input#searchInput"), search);

        app.getSessionHelper().click(By.cssSelector("input#searchButton.searchButton"));
    }



}
