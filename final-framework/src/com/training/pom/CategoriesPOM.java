package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.GenericMethods;
import com.trianing.waits.WaitTypes;

public class CategoriesPOM {
	private WebDriver driver; 
	private GenericMethods genericMethods;
	private WaitTypes types = new WaitTypes(driver);

	public CategoriesPOM(WebDriver driver) { //constructor parametrization
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

//  Click on Categories link
	@FindBy(xpath="//li[@id=\"catalog\"]/ul/li[1]/a")
	private WebElement categoriesBtn;

	public void clickCategoriesBtn() {
		this.categoriesBtn.click();
	
	}
	
	// Click on Add new icon
	@FindBy(xpath="//i[@class='fa fa-plus']")
	private WebElement addNewBtn;

	public void clickAddNewBtn() {
		this.addNewBtn.click();
	
		}
	// Enter Valid credentials in Category Name textbox of General tab
	@FindBy(id="input-name1")
	private WebElement categoriesTextEdt;

	public void sendCategoriesTextEdt(String categories) {
		this.categoriesTextEdt.clear();
		this.categoriesTextEdt.sendKeys(categories);
	}
	
	// Enter Valid credentials in Description textbox of General tab
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	private WebElement descriptionEdt;

	public void sendDescriptionEdt(String description) {
		this.descriptionEdt.clear();
		this.descriptionEdt.sendKeys(description);
	}
	
	//Enter Valid credentials in Meta tag Title textbox of General tab
	@FindBy(id="input-meta-title1")
	private WebElement metaTagEdt;

	public void sendMetaTagEdt(String textbox) {
		this.metaTagEdt.clear();
		this.metaTagEdt.sendKeys(textbox);
	}
	//Enter Valid credentials in Meta tag Description textbox of General tab
	
	@FindBy(id="input-meta-description1")
	private WebElement metaDescribeEdt;

	public void sendMetaDescribeEdt(String describe) {
		this.metaDescribeEdt.clear();
		this.metaDescribeEdt.sendKeys(describe);
	}
	
	// Keep Data and Design tab fields with default values
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement saveBtn ;
	
	public void clickSaveBtn() {
		this.saveBtn.click();
	}
	
	
	
	
}
	
