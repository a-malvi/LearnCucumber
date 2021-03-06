Feature: MyAccount- Login Feature
Description: This feature will test login funcationaliy.

Scenario: Login with valid username and password
Given Open browser
When Enter the url 
And Enter registered username "admin" and password "admin"
And Click on Login button
Then User must succesfully login to the webpage



#Scenario Outline:: Login with valid username and password
#Given Open browser
#When Enter the url 
#And Enter registered username "<username>" and password "<password>"
#And Click on Login button
#Then verify Login 
#
#Examples:
#| username | password |
#| admin | admin | 
#| second | second | 
#| third | third | 