@regression @smoke @us-246
Feature: Drug Comparison

Scenario: User should be able to see comparison of two related drugs

Given Click on More on homepage
When Click on Comraison tool
And Click on Aimovig vs Botox
Then user should see the comparison between these two drugs.