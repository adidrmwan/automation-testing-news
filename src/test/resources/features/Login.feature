@Web @Kumparan @Login
  Feature: User be able to login

    Background:
      Given user open kumparan homepage

      @Positive
      Scenario: User be able to login using google plus
        When user click profile icon
        Then user on login page
        When user select google type login
        Then user on google login page