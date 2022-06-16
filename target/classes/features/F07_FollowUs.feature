@Smoke
  Feature: user can follow social
    Background: user open website

      Scenario: facebook is clickable
      Given user click on fb icon
        Then navigate to facebook page

      Scenario: twitter is clickable
        Given user click on twitter icon
        Then navigate to twitter page


    Scenario: RSS is clickable
      Given user click on rss icon
      Then navigate to rss page


    Scenario: youtube is clickable
      Given user click on youtube icon
      Then navigate to youtube page
