Feature: Register

Scenario: Verify registering an account with mandatory fields
Given User navigates on register page
When User enters valid firstname "" into firstname field
And User enters valid lastname "" into lastname field
And User enters valid email "" into email field
And User enters valid telephone "" into telephone field
And User enters valid password "" into password field
And User enters valid confirm password "" into confirm password field
And User selects privacy policy option
And clicks on register button
Then User should get registerd succesfully
And User should navigate on account success page

Scenario: Verify registering an account with all fields
Given User navigates on register page
When User enters valid firstname "" into firstname field
And User enters valid lastname "" into lastname field
And User enters valid email "" into email field
And User enters valid telephone "" into telephone field
And User enters valid password "" into password field
And User enters valid confirm password "" into confirm password field
And User selects newsletter option
And User selects privacy policy option
And clicks on register button
Then User should get registerd succesfully
And User should navigate on account success page

Scenario: Verify registering an account with valid fields
Given User navigates on register page
When User enters valid firstname "" into firstname field
And User enters valid lastname "" into lastname field
And User enters valid email "" into email field
And User enters valid telephone "" into telephone field
And User enters valid password "" into password field
And User enters valid confirm password "" into confirm password field
And User selects privacy policy option
And clicks on register button
Then User should get registerd succesfully
And User should navigate on account success page

Scenario: Verify registering an account with invalid fields
Given User navigates on register page
When User enters invalid firstname "" into firstname field
And User enters invalid lastname "" into lastname field
And User enters invalid email "" into email field
And User enters invalid telephone "" into telephone field
And User enters invalid password "" into password field
And User enters invalid confirm password "" into confirm password field
And User selects privacy policy option
And clicks on register button
Then User should not get registerd succesfully
And User should get warning massage ""

