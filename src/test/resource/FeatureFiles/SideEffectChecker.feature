@regression @smoke @us-246
Feature: Side Effect Checking

Scenario: User should be able to see the side effects of any drug.

	Given User is on the Drugs homepage
	When click on Side Effects
	And Enter Tolterodine on search box
	And click on Search Button
	Then Side effects informatins of the drug appeared