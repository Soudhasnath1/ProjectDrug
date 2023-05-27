@regression @smoke @us-246
Feature: Support Functionality

Scenario: user should be able to see poison center information
Given browse on homepage
When click on help center
And click on poison control center
Then poison control center information should appear