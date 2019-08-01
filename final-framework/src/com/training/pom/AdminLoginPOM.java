package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.GenericMethods;
import com.trianing.waits.WaitTypes;

public class AdminLoginPOM {
	private WebDriver driver; 
	private GenericMethods genericMethods;
	private WaitTypes types = new WaitTypes(driver);

	public AdminLoginPOM(WebDriver driver) { //constructor parametrization
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//provide admin username
@FindBy(name="username")
private WebElement usernameEdt;

public void sendUsernameEdt(String userName) {
	this.usernameEdt.clear();
	this.usernameEdt.sendKeys(userName);
}
//provide admin password
@FindBy(name="password")
private WebElement passwordEdt;

public void sendPasswordEdt(String password) {
	this.passwordEdt.clear();
	this.passwordEdt.sendKeys(password);
}
//click on login
@FindBy(xpath="//button[@class='btn btn-primary']")
private WebElement loginBtn;

public void clickLoginBtn() {
	this.loginBtn.click();

}


	
}
