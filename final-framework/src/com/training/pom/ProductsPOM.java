package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.training.generics.GenericMethods;
import com.trianing.waits.WaitTypes;

public class ProductsPOM {
	private WebDriver driver; 
	private GenericMethods genericMethods;
	private WaitTypes types = new WaitTypes(driver);

	public ProductsPOM(WebDriver driver) { //constructor parametrization
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	//click on Add New icon
		@FindBy(xpath="//i[@class='fa fa-plus']")
		private WebElement addNewIcon;

		public void clickAddNewIcon() {
			this.addNewIcon.click();

		}
		//Enter Valid credentials in Product Name of General tab
		@FindBy(name="product_description[1][name]")
		private WebElement productNameEdt;
		

		public void sendProductNameEdt(String productName) {
			this.productNameEdt.clear();
			this.productNameEdt.sendKeys(productName);
		}
		//Enter Valid credentials in Meta Tag Title of General tab
		@FindBy(name="product_description[1][meta_title]")
		private WebElement metaTagEdt;

		public void sendMetaTagEdt(String productName) {
			this.metaTagEdt.clear();
			this.metaTagEdt.sendKeys(productName);
		}
		
		 // Click on Data tab
		@FindBy(xpath="//a[contains(text(),'Data')]")
		private WebElement dataTab;

		public void clickDataTab() {
			this.dataTab.click();
	}
		//Enter valid credentials in Model textbox
		@FindBy(name="model")
		private WebElement modelEdt;

		public void sendModelEdt(String modelName) {
			this.modelEdt.clear();
			this.modelEdt.sendKeys(modelName);
		}
		
		//Enter valid credentials in Price textbox
		@FindBy(name="price")
		private WebElement priceEdt;

		public void sendPriceEdt(String price) {
			this.priceEdt.clear();
			this.priceEdt.sendKeys(price);
		}
		
		//Enter valid credentials in Quantity textbox
		@FindBy(name="quantity")
		private WebElement quantityEdt;

		public void sendQuantityEdt(String quantity) {
			this.quantityEdt.clear();
			this.quantityEdt.sendKeys(quantity);
		}
		
//		/Click on Links tab
		@FindBy(xpath="//a[contains(text(),'Links')]")
		private WebElement linksTab;

		public void clickLinksTab() {
			this.linksTab.click();
	}
		
		//Click on Categories textbox
		@FindBy(id="input-category")
		private WebElement categoriesEdt;

		public void clickCategoriesEdt() throws InterruptedException {
			this.categoriesEdt.click();
			Thread.sleep(30);
		
		}
		
		//Select Category from displayed category list
		@FindBy(id="product-category")
		private WebElement categoriesListEdt;

		public void clickCategoriesListEdt() {
			this.categoriesListEdt.click();
			
		}
		//Click on Discount tab
		@FindBy(xpath="//a[contains(text(),'Discount')]")
		private WebElement discountTab;

		public void clickDiscountTab() {
			this.discountTab.click();
		
		}
		
		//Click on Add discount icon
		@FindBy(xpath="//table[@id=\"discount\"]/tfoot/tr/td[2]/button/i")
		private WebElement addDiscountTab;

		public void clickAddDiscountTab() {
			this.addDiscountTab.click();
		
		}
		
		//Enter valid credentials in Quantity textbox
		@FindBy(name="product_discount[0][quantity]")
		private WebElement quantityValue;

		public void sendQuantityValue(String quantity) {
			this.quantityValue.clear();
			this.quantityValue.sendKeys(quantity);
		}
		
		//Enter valid credentials in Price textbox
		@FindBy(name="product_discount[0][price]")
		private WebElement priceAmt;

		public void sendPriceAmt(String priceAmt) {
			this.priceAmt.clear();
			this.priceAmt.sendKeys(priceAmt);
		}
		
//		click on calender
		
		@FindBy(xpath="//input[@placeholder='Date Start']/following-sibling::span//i[@class='fa fa-calendar']")
		private WebElement startCalBtn;
		
		public void clickStartCalendr() {
			this.startCalBtn.click();
		}
//		Select valid start date as current date
		@FindBy(xpath="//div[@class='bootstrap-datetimepicker-widget dropdown-menu picker-open top']//td[@class='day active today']")
		private WebElement startDate;

		public void clickStartDate() {
			genericMethods = new GenericMethods(driver);
			genericMethods.jsClick(startDate);
		}
	//click on date end calendar
		@FindBy(xpath="//input[@placeholder='Date End']/following-sibling::span//i[@class='fa fa-calendar']")
private WebElement endCalBtn;
		
		public void clickEndCalBtn() {
			this.endCalBtn.click();
		}
		
		//Select valid end date as current date+one day
		@FindBy(xpath="//div[@class='bootstrap-datetimepicker-widget dropdown-menu picker-open top']//td[@class='day active today']/following-sibling::td")
		private WebElement endDate;

		public void clickEndDate() {
			genericMethods = new GenericMethods(driver);
			genericMethods.jsClick(endDate);
		
		}
		
		//Click on Rewards Point tab
		@FindBy(xpath="//form[@id=\"form-product\"]/ul/li[10]/a")
		private WebElement rewardPointsTab;

		public void clickRewardPointsTab() {
			this.rewardPointsTab.click();
		
		}
		
		//Enter valid credentials in points textbox
		@FindBy(id="input-points")
		private WebElement pointsEdt;

		public void sendPointsEdt(String point) {
			this.pointsEdt.clear();
			this.pointsEdt.sendKeys(point);
		}
		
		//Keep default values in Attribute, Option, Recurring,  Special, Image and Design tab
		@FindBy(xpath="//i[@class='fa fa-save']")
		private WebElement saveIcon;

		public void clickSaveIcon() {
			this.saveIcon.click();
		
		}
		
		
}
		
		
