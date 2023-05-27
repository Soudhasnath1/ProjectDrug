package drugs.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drugs.pageAction.DrugsAction;

public class DrugsStepDef {
	DrugsAction DrugsActionobj = new DrugsAction();

	@Given("^User is on the Drugs homepage$")
	public void user_is_on_the_Drugs_homepage() throws Throwable {
		
	}

	@When("^click on Side Effects$")
	public void click_on_Side_Effects() throws Throwable {
		DrugsActionobj.SideEfChck();
	}

	@When("^Enter Tolterodine on search box$")
	public void enter_Tolterodine_on_search_box() throws Throwable {
		DrugsActionobj.Searchbox();
	}
	@When("^click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
		DrugsActionobj.SearchboxClick();
	}



	@Then("^Side effects informatins of the drug appeared$")
	public void side_effects_informatins_of_the_drug_appeared() throws Throwable {   
	}
	///////////////////////////////////////
	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	  
	}

	@When("^click on register button$")
	public void click_on_register_button() throws Throwable {
		DrugsActionobj.register();
	}

	@When("^enter invalid email$")
	public void enter_invalid_email() throws Throwable {
		DrugsActionobj.Email();
	}

	@When("^click on continue$")
	public void click_on_continue() throws Throwable {
		DrugsActionobj.ConEmail();
	}
	@Then("^error messege should appear$")
	public void error_messege_should_appear() throws Throwable {}
/////////////////////////////////////////////////////////
	@Given("^user on homepage$")
	public void user_on_homepage() throws Throwable {
	}   
	
	@When("^cick on interaction checker$")
	public void cick_on_interaction_checker() throws Throwable {
		DrugsActionobj.IntCheck();
	}

	@When("^enter Tylenol on search box$")
	public void enter_Tylenol_on_search_box() throws Throwable {
		DrugsActionobj.searchbx();
	}

	@When("^click on Tylenol$")
	public void click_on_Tylenol() throws Throwable {
		DrugsActionobj.Add();
	}

	@Then("^click in interaction checker$")
	public void click_in_interaction_checker() throws Throwable {
		DrugsActionobj.Intchk();
	   
	}

	@When("^click on sign in$")
	public void click_on_sign_in() throws Throwable {
		DrugsActionobj.signin();
	}

	@When("^enter email on email box$")
	public void enter_email_on_email_box() throws Throwable {
		DrugsActionobj.username();
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		DrugsActionobj.PW();
	}

	@Then("^click on signin$")
	public void click_on_signin() throws Throwable {
		DrugsActionobj.SignIn();
	}////////////////////////////////////////////////////

	@Given("^Click on Browse Condition$")
	public void click_on_Browse_Condition() throws Throwable {
		DrugsActionobj.BrowseCOn();
	}

	@When("^Click on letter K$")
	public void click_on_letter_K() throws Throwable {
		DrugsActionobj.LetterK();
	}

	@When("^Click on knee pain$")
	public void click_on_knee_pain() throws Throwable {
		DrugsActionobj.KneePain();
	}

	@Then("^user should see th e information of knee pain$")
	public void user_should_see_th_e_information_of_knee_pain() throws Throwable {
	}
	//////////////////////////////////
	@Given("^Browse to homepage$")
	public void browse_to_homepage() throws Throwable {
	    
	}

	@When("^Enter Entyvio on search box$")
	public void enter_Entyvio_on_search_box() throws Throwable {
		DrugsActionobj.Searchbx();
	}

	@When("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		DrugsActionobj.searchbtn();
	}

	@When("^Click on Entyvio$")
	public void click_on_Entyvio() throws Throwable {
		DrugsActionobj.Entyvio();
	}

	@Then("^User should see information of Entyvio$")
	public void user_should_see_information_of_Entyvio() throws Throwable {  
	}///////////////////////////////////////////////////////
	@Given("^browse on homepage$")
	public void browse_on_homepage() throws Throwable {
	    
	}

	@When("^click on help center$")
	public void click_on_help_center() throws Throwable {
		DrugsActionobj.HelpCntr();
	}   

	@When("^click on poison control center$")
	public void click_on_poison_control_center() throws Throwable {
		DrugsActionobj.PoisnCntr();
	}

	@Then("^poison control center information should appear$")
	public void poison_control_center_information_should_appear() throws Throwable {
	    
	}///////////////////////////////////////////////
	@Given("^Click on More on homepage$")
	public void click_on_More_on_homepage() throws Throwable {
		DrugsActionobj.More();
	}
	
	@When("^Click on Comraison tool$")
	public void click_on_Comraison_tool() throws Throwable {
		DrugsActionobj.ComTool();
	}
	@When("^Click on Aimovig vs Botox$")
	public void click_on_Aimovig_vs_Botox() throws Throwable {
		DrugsActionobj.AimBoto();
	}

	@Then("^user should see the comparison between these two drugs\\.$")
	public void user_should_see_the_comparison_between_these_two_drugs() throws Throwable {
	  
	}//////////////////////////////////////////////
	@Given("^Go to homepage$")
	public void go_to_homepage() throws Throwable {
	
	}

	@When("^click on More$")
	public void click_on_More() throws Throwable {
		DrugsActionobj.MoreTab();
	}

	@When("^click on Drug hlaf life calculator$")
	public void click_on_Drug_hlaf_life_calculator() throws Throwable {
		DrugsActionobj.DhalfLife();
	}

	@When("^Enter (\\d+) into enter half life$")
	public void enter_into_enter_half_life(int arg1) throws Throwable {
		DrugsActionobj.HalfLifeBx(); 
	}

	@Then("^click on calculate$")
	public void click_on_calculate() throws Throwable {
		DrugsActionobj.Calculate();
	}///////////////////////////////////////////
	@Given("^Go to drugs homepage$")
	public void go_to_drugs_homepage() throws Throwable {
	    
	}
	@When("^click on next button$")
	public void click_on_next_button() throws Throwable {
		DrugsActionobj.Next();
	}

	@When("^click on Condition and deases$")
	public void click_on_Condition_and_deases() throws Throwable {
		DrugsActionobj.ConDeases();
	}

	@When("^click on hair loss$")
	public void click_on_hair_loss() throws Throwable {
		DrugsActionobj.HairLoss();
	}

	@Then("^User should see the condition and deases of hair loss$")
	public void user_should_see_the_condition_and_deases_of_hair_loss() throws Throwable {

	}
}
