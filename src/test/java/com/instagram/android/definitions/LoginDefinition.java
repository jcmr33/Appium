package com.instagram.android.definitions;

import com.instagram.android.steps.LoginSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition extends PageObject{

	@Steps
	 LoginSteps loginSteps;

	
	
	@When("^Alvaro creates new account$")
	public void alvaroCreatesNewAccount() {
		
	}

	@Then("^He validates create new account$")
	public void heValidatesCreateNewAccount() {
	  
	}
	
	@When("^Alvaro add favorite$")
	public void alvaroAddFavorite() throws InterruptedException {
		loginSteps.addFavorite();
	}

	@Then("^He validates favorite$")
	public void heValidatesFavorite() {
 
	}

	@When("^Search word \"([^\"]*)\"$")
	public void searchWord(String word) throws InterruptedException {
		loginSteps.openPage();
		loginSteps.enterWord(word);
	}

	@Then("^Validate word$")
	public void validateWord() throws InterruptedException {
		 
		
	  
	}
}
