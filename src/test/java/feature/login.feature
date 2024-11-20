Feature:
Sauce Demo Application

Scenario:
Checkout should be done

Given user navigate to the application
Given user enter the username as standard_user
And user enter the password as secret_sauce
And user click on the login button
And user add a product to the cart
And user click on the badge icon
When user click on the checkout button
Then checkout should be done.

