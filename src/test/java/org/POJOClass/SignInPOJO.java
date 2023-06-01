package org.POJOClass;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPOJO extends BaseClass{
	public SignInPOJO() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement CreateNew;
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement lastname;
	
	@FindBy(name = "reg_email__")
	private WebElement email;
	
	@FindBy(name = "reg_passwd__")
	private WebElement password;

	public WebElement getCreateNew() {
		return CreateNew;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

}
