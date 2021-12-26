package pages;

import org.openqa.selenium.By;
import util.Util;

public class LoginPage extends BasePage {

    private  static final String SITE_URL = "https://qa-demo.kdev2.cone.ee/";
    private  static final String PASSWORD =  new Util().getPropertyValue("P_KEY");
    private  static final String PASSWORD_WRONG = new Util().getPropertyValue("P_KEY_WRONG");
    private  static final String CONNECT_BUTTON = "//button[@id=\"api-key-button\"]";
    private  static final String INPUT_PASSWORD_FIELD = "//input[@id=\"api-key-field\"]";





    public LoginPage smokeAuthorization() {
        goTo(SITE_URL);
        click(By.xpath(INPUT_PASSWORD_FIELD));
        sendKeys(By.xpath(INPUT_PASSWORD_FIELD), PASSWORD);
        click(By.xpath(CONNECT_BUTTON));
        return this;
    }

    public LoginPage smokeAuthorizationWrong() {
        goTo(SITE_URL);
        click(By.xpath(INPUT_PASSWORD_FIELD));
        sendKeys(By.xpath(INPUT_PASSWORD_FIELD), PASSWORD_WRONG);
        click(By.xpath(CONNECT_BUTTON));
        return this;
    }

}
