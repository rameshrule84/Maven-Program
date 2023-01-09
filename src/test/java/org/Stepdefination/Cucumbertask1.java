package org.Stepdefination;
import org.Baseclass.Baseclass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.xml.LaunchSuite;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class Cucumbertask1 extends Baseclass {
	@Given("User has to launch the browser and max the window")
	public void user_has_to_launch_the_browser_and_max_the_window() {
	    browserlanuch();
	}
	@When("User has to lauch th fb appl in broswer")
	public void user_has_to_lauch_th_fb_appl_in_broswer() {
	    lanuchurl("https://www.facebook.com/");
	}
	@When("User has to pass invalid username in email field")
	public void user_has_to_pass_invalid_username_in_email_field() {
	    d.findElement(By.id("email")).sendKeys("ramesh");
	    Assert a=new Assert();
	}
	@When("User has to pass the invalid password in password field")
	public void user_has_to_pass_the_invalid_password_in_password_field() {
		d.findElement(By.id("pass")).sendKeys("123456");
	}
	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	    d.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	@Then("User has to close the broswer")
	public void user_has_to_close_the_broswer() {
	    closebroswer();
	}
	@When("User has to launch the chrome broswer")
	public void user_has_to_launch_the_chrome_broswer() {
	    browserlanuch();
	}

	@When("User has launch the fb url")
	public void user_has_launch_the_fb_url() {
	   lanuchurl("https://www.facebook.com/");
	}

	@When("User has to pass invalid username{string} in email field")
	public void user_has_to_pass_invalid_username_in_email_field(String ef) {
		d.findElement(By.id("email")).sendKeys(ef);
	}

	@When("User has to pass invalid password{string} in password field")
	public void user_has_to_pass_invalid_password_in_password_field(String pf) {
		d.findElement(By.id("pass")).sendKeys(pf);
	}

	@When("User has click the login button")
	public void user_has_click_the_login_button() {
		d.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
