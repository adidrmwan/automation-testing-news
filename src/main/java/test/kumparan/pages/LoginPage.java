package test.kumparan.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import test.kumparan.pageobject.BasePageObject;

@Component("test.kumparan.pages.LoginPage")
public class LoginPage extends BasePageObject {

    private By title() {
        return By.xpath("//span[text()= 'Masuk']");
    }

    private By googleType() {
        return By.cssSelector("button[data-qa-id='btn-login-google']");
    }

    private By facebookType() {
        return By.cssSelector("button[data-qa-id='btn-login-fb']");
    }

    public boolean isOnPage() {
        return waitUntilPresence(title()).isDisplayed();
    }

    public void selectGoogleType() {
        onClick(googleType());
    }

    public void selectFacebookType() {
        onClick(facebookType());
    }

    public String getCurrentLoginUrl() {
        return getCurrentUrl();
    }
}
