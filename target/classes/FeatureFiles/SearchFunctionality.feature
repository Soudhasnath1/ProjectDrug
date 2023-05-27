@regression @smoke @us-246
Feature: Search Functionality

Scenario: User should be able to search any drug

Given Browse to homepage
When Enter Entyvio on search box
And Click on search button
And Click on Entyvio
Then User should see information of Entyvio