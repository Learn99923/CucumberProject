Feature: Register

Scenario: Verify registering an account with mandatory fields
Given User navigates on register page
When User enters valid firstname "Samir" into firstname field
And User enters valid lastname "Khan" into lastname field
And User enters valid email "samirkhan2@gmail.com" into email field of register page
And User enters valid telephone "9921992199" into telephone field 
And User enters valid password "992199" into password field of register page
And User enters valid confirm password "992199" into confirm password field
And User selects privacy policy option
And clicks on register button
Then User should get registerd succesfully
And User should navigate on account success page