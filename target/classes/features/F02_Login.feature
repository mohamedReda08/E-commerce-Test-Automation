@Smoke
Feature: test
  Background: User open website

  Scenario: User login
    Given Click on login tab
    And Enter valid Email & Password "Mopweqwnm@gmail.com" and "Moh@12345"
    And Click on login button

    Then User Logged in successfully
