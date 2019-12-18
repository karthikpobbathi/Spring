Feature: Employee Registartion Application

 Scenario: User launching the application
  Given Opening the home page 
   
   Then Header content should be verified
   
   When Contact Us link is clicked
   Then Contact Us page should be opened and title should be 'Contact Us'
  
   When Register link is clicked 
   Then Register page is opened and title should be 'Employee Registration Page'
 
When Submit button is clicked without entering any values in the fields
   Then alert message should be displayed as 'Please fill in the Your Employee Name box'
   
   
    When Submit button is clicked without entering Employee Number field
   Then alert message should be displayed as 'Enter Employee Number'.
   
   
   When any character is entered in the contact Number field without entering Employee name field 
    Then alert message should be displayed as 'Please fill in the Your Employee Name box'
    
   When any character is entered in the contact number field
    Then alert message should  display as 'Enter Number'
   
  
   
   When submit button is clicked without selecting the Job Location option
   Then alert message should be displayed as 'Select your Job Location'
   
    
   When Submit button is clicked without giving the valid email id
   Then error message should be displayed as 'You have entered an invalid email address!'
   
    When Submit button is clicked it navigate to next page
   Then  message should be displayed as 'Registered Successfully!'
   
   Then Title should be Confirmation Page