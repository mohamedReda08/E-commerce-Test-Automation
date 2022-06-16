@Smoke
  Feature: home slider
    Background: user open website

Scenario: user press on first Slider
  Given slider 1 is displayed
  When user click on first slider

  Then user navigate to nokia url

  Scenario: user press on second slider
    Given slider 2 is displayed
    When user click on second slider

    Then user navigate to iphone url
