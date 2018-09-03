import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.*;

public class LeftNavMenuTest extends TestBase
{
    @Test
    public void interactionMenuTest()
    {
        clickOnEnglishLink();
        WebElement interactionNavMenu = driver.findElement(By.id("p-interaction"));

        List <WebElement> itemsMenu = interactionNavMenu.findElements(By.cssSelector("div#p-interaction li"));

        for (int i = 1; i<itemsMenu.size(); i++)
        {
            WebElement item = driver.findElement(By.cssSelector("div#p-interaction ntn child(" +i +"2)"));
            String itemName = item.getText();
            System.out.println(itemName);
        }

        /* for (WebElement item : itemsMenu)
        {
            String itemName = item.getText();
            item.click();
            String text = driver.findElement(By.cssSelector("#firstHeading")).getText();
            System.out.println(itemName);
            System.out.println(text);
        } */

    }
}
