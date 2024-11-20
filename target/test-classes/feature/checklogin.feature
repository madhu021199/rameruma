Feature:Book cart applicsation demo

Scenario: login should be success

Given user navigate to the bookcartapplication
And user click on the login link
And user enter the username as ortoni
And user enter the password as pass1234
When user click on the bookcartlogin button
Then login should be success.

Scenario: login should be failure

Given user navigate to the bookcartapplication
And user click on the login link
And user enter the username as koushik
And user enter the password as pass123
When user click on the bookcartlogin button
But login should be Fail.

