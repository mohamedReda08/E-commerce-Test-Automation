@Smoke
  Feature: user can search
    Background: User open website
    Scenario: user search with keyword
    Scenario Outline : user search with keyword

     Given user type "<keyword>" in search box
      When user press on search button

      Then user get results match with "<keyword>"

    Examples:
      |keyword|
      |book|
      |laptop|
      |nike|

    Scenario: user search with sku
      Given user type sku on search box
      And user click on search button

      When user click on product
      Then user got product of sku