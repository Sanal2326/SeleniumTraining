package org.stepdefinition;
import org.Base.BaseClass;
import org.POJOClass.SamplePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveNegativeFblogin extends BaseClass{
	SamplePOJO f;
	@Given("User has to launch the browser and maximize the window")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("User has to hit the gmail url")
	public void user_has_to_hit_the_gmail_url() {
	    launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S168601970%3A1684986610831882&authuser=0&continue=https%3A%2F%2Fmyaccount.google.com%2F&ec=GAlAwAE&hl=en&service=accountsettings&flowName=GlifWebSignIn&flowEntry=AddSession");
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
	  f = new SamplePOJO();
	  passText(em, f.getEmail());
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
	   clickBtn(f.getLoginbtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	   closeEntireBrowser();
	}

}
