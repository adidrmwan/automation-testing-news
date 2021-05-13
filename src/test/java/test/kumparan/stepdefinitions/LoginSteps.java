package test.kumparan.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import test.kumparan.pages.HomePage;
import test.kumparan.pages.LoginPage;

public class LoginSteps {
    @Autowired
    HomePage homePage;
    @Autowired
    LoginPage loginPage;

    @Given("user open kumparan homepage")
    public void userOpenKumparanHomepage() {
        homePage.openPage();
    }

    @When("user click profile icon")
    public void userClickProfileIcon() {
        homePage.clickProfileIcon();
    }

    @Then("user on login page")
    public void userOnLoginPage() {
        boolean actual = loginPage.isOnPage();
        Assert.assertTrue(actual);
    }

    @When("user select google type login")
    public void userSelectGoogleTypeLogin() {
        loginPage.selectGoogleType();
    }

    @Then("user on google login page")
    public void userOnGoogleLoginPage() {
        String actual = loginPage.getCurrentLoginUrl();
        Assert.assertTrue(actual.contains("https://accounts.google.com/"));
    }
}
