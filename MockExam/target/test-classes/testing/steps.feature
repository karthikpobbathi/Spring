

Feature:
  Scenario: User have to enter the details
    Given Personal details page
    When I click on next without entering data in firstname page
    Then In alert box it have to show "Please fill the First Name"
    When I click on next without entering data in lastname page
    Then In alert box it have to show "Please fill the Last Name"

 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

