Feature:  checking PersonalDetailsPage functionality
Scenario: When i dont give the firstname
Given  PersonalDetailsPage shows up. 
When I dont give the firstname . 
And click on the next hperlink
Then I should get Please fill the First Name in alert box