package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.Cards;
import pages.LoginPage;
import pages.NewGamePage;

public class BlackJackTest extends BasePage {

    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    NewGamePage createNewGame = PageFactory.initElements(driver, NewGamePage.class);


    @Test
    public void logValidKeyTest() {
        loginPage.smokeAuthorization();
    }


    @Test
    public void logInvalidKeyTest() {
        loginPage.smokeAuthorizationWrong();
    }

    @Test
    public void createNewGameTestDealerTest() {
        loginPage.smokeAuthorization();
        createNewGame.newGame()
                     .clickDealerMod(Cards.QUEEN_CLUB)
                     .clickDealerMod(Cards.QUEEN_DIAMOND)
                     .clickDealerMod(Cards.QUEEN_HEART);

    }


}
