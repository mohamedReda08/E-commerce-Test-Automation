@Smoke
Feature: test

  Background: User open website

    Scenario: user registration
    Given user press on register tab
    And user select gender
    And user enter "Youssef" and "Reda"
    And user choose birthDate "21" "December" "1989"
    And user enter email and company "Mopweqwnm@gmail.com" and "Jumia"
    And user enter password and confirm "Moh@12345" and "Moh@12345"
    And user press submit

    Then user register successfully


