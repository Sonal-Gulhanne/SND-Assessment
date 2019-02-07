#Author: sgulhane15@gmail.com
#Keywords Summary :
#Feature:Registration
@tag
Feature: Registration

  @tag1
  Scenario: User Sign up on Springer Nature Digital website
    Given I am on home page
      And user clicks on SignUp link
      And User enters details for registration as:
      | FirstName | LastName | Email                | Password |
      | Sonal     | Gulhane  | sgulhane15@gmail.com | SNDtest  |
     Then Account should be created
