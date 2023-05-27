@regression @smoke @us-246
Feature: Condition and Deases feature

Scenario: User should be able to browse condition and deases

Given Go to drugs homepage
When click on next button
And click on Condition and deases
And click on hair loss
Then User should see the condition and deases of hair loss
