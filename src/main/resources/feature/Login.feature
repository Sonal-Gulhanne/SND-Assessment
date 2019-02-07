#Author: sgulhane15@gmail.com
#Keywords Summary :
#Feature: Login
#Scenario: User sign up and sign in
@tag
Feature: Login

  @tag1
  Scenario: Home Page validation
    Given I am on home page
      And user clicks on SignUp link
     Then Registration Page is opened
