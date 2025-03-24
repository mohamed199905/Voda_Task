Feature: Adding items to the cart

  Scenario: User adds 3 items to the cart
    Given User navigates to the Vodafone e-shop homepage
    When User selects 2 items and adds them to the cart
    And User selects an item using the search bar and adds it to the cart
    Then Items are added to the cart
    And user don't proceed with the order
