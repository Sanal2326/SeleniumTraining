package org.POJOClass;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamplePOJO extends BaseClass{
	public SamplePOJO() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "identifier")
	private WebElement email;
	@FindBy(id = "pass" )
	private WebElement password;
	@FindBy(xpath = "(//span[@jsname='V67aGc'])[2]")
	private WebElement loginbtn;

	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
