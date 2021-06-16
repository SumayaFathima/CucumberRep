package com.adactin.stepdefinition;

import org.openqa.selenium.By;

import com.baseclass.Baseclass;

import io.cucumber.java.en.*;

public class Stepdefinition2 extends Baseclass {
	
	@When("USER will hit the URL")
	public void userWillHitTheURL() {
	    System.out.println("url3");
	}

	@When("USER will enter the Username and Password")
	public void userWillEnterTheUsernameAndPassword() {
	   System.out.println("US3");
	}

	@When("USER will click the login button")
	public void userWillClickTheLoginButton() {
	   System.out.println("login3");
	}

	@Then("USER will verify the login functionality")
	public void userWillVerifyTheLoginFunctionality() {
		System.out.println("func3");
	}

}