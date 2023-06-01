package org.stepdefinition;
import org.Base.BaseClass;
import org.POJOClass.SamplePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass{
	SamplePOJO f;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of the gmail application")
	public void to_launch_the_url_of_the_gmail_application() {
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S168601970%3A1684986610831882&authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession");
	  
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f = new SamplePOJO();
		passText("sanalsanal@gmail.com", f.getEmail());
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		clickBtn(f.getLoginbtn());
	    
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeEntireBrowser(); 
	}

}
