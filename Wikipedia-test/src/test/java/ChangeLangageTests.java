import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLangageTests extends TestBase {
    @Test
    public void openHomepageOnEnglish() {

        clickOnEnglishLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://en.wikipedia.org/wiki/Main_Page";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void openHomepageOnJapanese() {

        clickOnJapaneseLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://ja.wikipedia.org/wiki/%E3%83%A1%E3%82%A4%E3%83%B3%E3%83%9A%E3%83%BC%E3%82%B8";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }


    @Test
    public void openHomepageOnDeutch() {

        clickOnDeutchLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://de.wikipedia.org/wiki/Wikipedia:Hauptseite";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void openHomepageOnItalian() {

        clickOnItalianLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://it.wikipedia.org/wiki/Pagina_principale";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void openHomepageOnPortugues() {

        clickOnPortuguesLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://pt.wikipedia.org/wiki/Wikip%C3%A9dia:P%C3%A1gina_principal";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void openHomepageOnChinese() {

        clickOnChinsesLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://zh.wikipedia.org/wiki/Wikipedia:%E9%A6%96%E9%A1%B5";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void openHomepageOnRussian() {

        clickOnRussianLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }

    @Test
    public void openHomepageOnEspagnol() {

        clickOnEspagnolLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://es.wikipedia.org/wiki/Wikipedia:Portada";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }


    @Test
    public void openHomepageOnFrench() {

        clickOnFrenchLink();

        String currentUrl = driver.getCurrentUrl();
        String expectedURL = "https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal";

        Assert.assertEquals(currentUrl, expectedURL);

        returnToPreviousPage();
    }



    private void clickOnEspagnolLink() {
        click(By.cssSelector("a#js-link-box-es"));
    }


    private void clickOnRussianLink() {
        click(By.cssSelector("a#js-link-box-ru"));
    }

    private void clickOnChinsesLink() {
        click(By.cssSelector("a#js-link-box-zh"));
    }

    private void clickOnPortuguesLink() {
        click(By.cssSelector("a#js-link-box-pt"));
    }

    private void clickOnItalianLink() {
        click(By.cssSelector("a#js-link-box-it"));
    }

    private void clickOnDeutchLink() {
        click(By.cssSelector("a#js-link-box-de"));
    }

    private void clickOnJapaneseLink() {
        click(By.cssSelector("a#js-link-box-ja"));
    }

    private void returnToPreviousPage() {
        driver.navigate().back();
    }

    private void clickOnEnglishLink() {
        click(By.cssSelector("a#js-link-box-en"));
    }


}