package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewGamePage extends BasePage {

    private  static final String START_NG_V1_BUTTON = "//button[@id=\"start_ng_button\"]";
    private  static final String START_NG_V2_BUTTON = "//button[@id=\"start_ng_button1\"]";
    private  static final String INPUT_GAME_NAME = "//input[@id=\"game_name\"]";







    public NewGamePage newGame () {
        isElementDisplayed(By.xpath(INPUT_GAME_NAME));
        click(By.xpath(INPUT_GAME_NAME));
        sendKeys(By.xpath(INPUT_GAME_NAME), "SuperGame");
        click(By.xpath(START_NG_V2_BUTTON));
        return this;
    }

    public NewGamePage clickDealerMod(Cards cardName)  {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(cardName.getName()))).click();
        return this;
    }
}
