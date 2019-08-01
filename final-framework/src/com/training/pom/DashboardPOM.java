package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.GenericMethods;
import com.trianing.waits.WaitTypes;

public class DashboardPOM {
	private WebDriver driver; 
	private GenericMethods genericMethods;
	private WaitTypes types = new WaitTypes(driver);

	public DashboardPOM(WebDriver driver) { //constructor parametrization
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//click on Catelog Icon
	@FindBy(xpath="//i[@class='fa fa-tags fa-fw']")
	private WebElement catelogIcon;

	public void clickCatelogIconBtn() {
		this.catelogIcon.click();

	}
	//click on Products
	@FindBy(xpath="//li[@id=\"catalog\"]/ul/li[2]/a")
	private WebElement productIcon;

	public void clickProductIconBtn() {
		this.productIcon.click();

	}
}


