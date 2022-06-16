@Smoke
  Feature: user add products to wishlist
    Background: user open website

      Scenario: success message is visible after adding product to wishlist
        When user add product to wishlist
        Then wishlist success notification is displayed

