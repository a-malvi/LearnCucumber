Feature: Learn tagging - Cucumber 
Description: code to learn tagging in cucumber

@SanityTest
Scenario: Login
Given Test for login

@SmokeTest 
Scenario: Logout
Given Test for logout

@SmokeTest @SanityTest
Scenario: Add
Given Test for Add

@End2EndTest
Scenario: substract
Given Test for sub