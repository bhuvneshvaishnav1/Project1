
@tag
Feature: To check if user is able to order product on SauceLab
 

  @tag1
  Scenario: Check if user is able to order item
    Given I login to sauce lab
    When I add item to cart 
    And I go to cart
    And I fill info on overview page
    Then I click checkout 
    And I click finish

  @tag2
  Scenario Outline: Check if user is able to login with different credentials
    Given I navigate to landing page 
    When I enter credentials as <uname> and <password>
    Then I verify user is logged in

    Examples: 
      | uname    | password| 
      | standard_user        | secret_sauce       |
      | locked_out_user      | secret_sauce       |
      | problem_user         | secret_sauce       |