Feature: Validates in the instagram app


@Login
  Scenario: Create new account.
    When Alvaro creates new account
    Then He validates create new account
    

@Login1
  Scenario: Add favorite.
    When Alvaro add favorite
    Then He validates favorite
    
@Login2
   Scenario Outline: Search word
	When Search word "<word>"
	Then Validate word
Examples:
      |word|
      |hola|