package org.FBpoja;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.BaseClassFinder;
public class FBLoginPojo extends BaseClassFinder{
	public FBLoginPojo() {
	PageFactory.initElements(d, this);
	}
	@FindBy(id="email")
	private WebElement emailtxt;
	@FindBy(name="pass")
	private WebElement passwordtxt;
	@FindBy(name="login")
	private WebElement loginbtn;
	public WebElement getEmailtxt() {
		return emailtxt;
	}
	public WebElement getPasswordtxt() {
		return passwordtxt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
