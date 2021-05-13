@Web @Kumparan @News
Feature: User be able to see news
  Background:
    Given user open kumparan homepage

    @Positive
    Scenario: User be able to see news based on channel
      When user select channel "entertainment"
      Then user on channel "entertainment" page
      When user click title of news
      Then user see details of news