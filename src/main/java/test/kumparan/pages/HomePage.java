package test.kumparan.pages;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.kumparan.pageobject.BasePageObject;
import test.kumparan.properties.ConfigProperties;

@Component("test.kumparan.pages.HomePage")
public class HomePage extends BasePageObject {
    @Autowired
    ConfigProperties configProperties;

    private By title() {
        return By.cssSelector("a[data-qa-id='hd-logo']");
    }

    private By profileIcon() {
        return By.cssSelector("button[data-qa-id='hd-login']");
    }

    public void clickProfileIcon() {
        onClick(profileIcon());
    }

    public boolean isOnPage() {
        return waitUntilPresence(title()).isDisplayed();
    }

    public void openPage() {
        goTo("https://kumparan.com/");
    }
}
