package com.adactin.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.baseclass.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Stepdefinition extends Baseclass {
	
	
	@When("User will hit the URL")
	public void userWillHitTheURL() {
		getUrl("https://en-gb.facebook.com/");
	    System.out.println("url1");
	}

	@When("User will enter the Username and Password")
	public void userWillEnterTheUsernameAndPassword(DataTable d) {
		
		List<Map<String, String>> mp = d.asMaps();
		
		String user = mp.get(1).get("Username");
		driver.findElement(By.name("email")).sendKeys(user);
		
		driver.findElement(By.name("pass")).sendKeys(mp.get(2).get("Password"));
	}

	@When("User will click the login button")
	public void userWillClickTheLoginButton() {
	    System.out.println("login1");
	}

	@Then("User will verify the login functionality")
	public void userWillVerifyTheLoginFunctionality() {
	  System.out.println("func1");
	}

	@When("User will hit the url")
	public void userWillHitTheUrl() {
	   System.out.println("url 2");
	}

	@When("User will enter the Username and PASSWORD")
	public void userWillEnterTheUsernameAndPASSWORD() {
	    System.out.println("US and pass 2");
	}

	@When("User will click the LOGIN button")
	public void userWillClickTheLOGINButton() {
	    System.out.println("login2");
	}

	@Then("User will verify the LOGIN functionality")
	public void userWillVerifyTheLOGINFunctionality() {
	    System.out.println("func2");
	}




}