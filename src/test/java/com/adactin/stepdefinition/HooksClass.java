package com.adactin.stepdefinition;

import com.baseclass.Baseclass;

import io.cucumber.java.*;

public class HooksClass extends Baseclass{
	
	@Before (order=1)
	public void LaunchBrowser() {
		browserLaunch("chrome");
		System.out.println("browser launched");
	}
	
	@Before (order=3 , value = "@Smoke")
	public void maxWindow() {
		System.out.println("max win");
	}
	
	@Before (order=2 , value = "@Sanity")
	public void waitTime() {
		System.out.println("wait time");
	}
	
	@Before (order=4 , value = "@Sanity")
	public void setCookies() {
		System.out.println("Set Cookies");
	}
	
	@After (order=3 , value = "@Smoke")
	public void endBrowser() {
		System.out.println("endBrowser");
	}
	
	@After (order=1 , value = "@Smoke")
	public void clearCookies() {
		System.out.println("clearCookies");
	}
	
	@After (order=2 , value = "@Sanity")
	public void logOut() {
		System.out.println("logOut");
	}
}
