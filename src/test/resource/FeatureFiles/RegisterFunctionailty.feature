@regression @smoke @us-246
Feature: Register functionality

Scenario: User should not be able to login with invalid credentials

	Given User is on homepage
	When click on register button
	And enter invalid email
	And click on continue
	Then error messege should appear