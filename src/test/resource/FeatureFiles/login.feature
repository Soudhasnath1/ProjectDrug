@regression @smoke @us-246
Feature: Login functionality

Scenario: user should be able to log in with valid credential


Given click on sign in
When enter email on email box
And enter password
Then click on signin