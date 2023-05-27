@regression @smoke @us-246
Feature: Interaction checker

	Scenario: User should be able to Check interaction of any drugs.
	
	Given user on homepage
	When cick on interaction checker 
	And enter Tylenol on search box
	And click on Tylenol
	Then click in interaction checker
	

