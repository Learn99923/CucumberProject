Feature: Login

Scenario: Verify login with valid credentials
Given User navigates on login page
When User enters valid email "nasirkhan@gmail.com" into email field
And User enters valid password "992199" into password field
And User clicks on login button
Then User should get logged in succefully
And User should navigate on my account page

Scenario: Verify login with invalid credentials
Given User navigates on login page
When User enters invalid email "nasir1@gmail.com" into email field
And User enters invalid password "996424" into password field
And User clicks on login button
Then User should not get logged in succefully
And User should display warning massage "Warning: No match for E-Mail Address and/or Password."

Scenario: Verify login with valid email and invalid password credentials
Given User navigates on login page
When User enters valid email "nasirkhan@gmail.com" into email field
And User enters invalid password "9964" into password field
And User clicks on login button
Then User should not get logged in succefully
And User should display warning massage "Warning: No match for E-Mail Address and/or Password."

Scenario: Verify login with invalid email and valid password credentials
Given User navigates on login page
When User enters invalid email "nasir1@gmail.com" into email field
And User enters valid password "992199" into password field
And User clicks on login button
Then User should not get logged in succefully
And User should display warning massage "Warning: No match for E-Mail Address and/or Password."
