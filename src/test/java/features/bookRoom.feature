Feature: select hotel feature
  This test case has as objective of select
  a new hotel picking any date and any city, the feature will select
  the third option always

  Background:
    Given The user set up the enviroment

  Scenario: Select Successful hotel

    Given The user enter at booking.com
    When the user selects the city and the dates to stay
      | City   | Date to | Date from             |
      | Bogota | today   | three days from today|
    And the user search for the options
    And the user checks for availability
      |option|
      |3     |
    And the user selects the first option of room
    And the user reserves the room
    And the user provide personal info about the reservation
      |name|lastname|email| reservation|
      |Test| Automation|test@automation.com|me|
    And the user provide the phone number and the reservation acceptance
      |phone number| acceptance status|
      |30012345678 |yes               |
    Then the user confirms that the reservation has done successfully