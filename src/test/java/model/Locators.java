package model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locators {
	
	static WebDriver driver;

	public static String bankHomePageUrl = "https://parabank.parasoft.com/parabank/index.htm";

	
	// Link Click
	public static By regigterClick = By.xpath("//a[normalize-space()='Register']");

	// Button Click
	public static By loginBtn = By.xpath("//input[@value='Log In']");
	public static By registerBtnClick = By.xpath("//input[@value='Register']");
	
//  Registration Account
	public static By fName = By.xpath("//input[@id='customer.firstName']");
	public static By lName = By.xpath("//input[@id='customer.lastName']");
	public static By address = By.xpath("//input[@id='customer.address.street']");
	public static By city = By.xpath("//input[@id='customer.address.city']");
	public static By state = By.xpath("//input[@id='customer.address.state']");
	public static By zipCode = By.xpath("//input[@id='customer.address.zipCode']");
	public static By phone = By.xpath("//input[@id='customer.phoneNumber']");
	public static By ssn = By.xpath("//input[@id='customer.ssn']");
	public static By uName = By.xpath("//input[@id='customer.username']");
	public static By pass = By.xpath("//input[@id='customer.password']");
	public static By cPass = By.xpath("//input[@id='repeatedPassword']");
	
	
	// Login Username & Password
	public static By username = By.xpath("//input[@name='username']");
	public static By password = By.xpath("//input[@name='password']");

	
	
// 	Open New another Account
	public static By openAccountClick = By.xpath("//a[normalize-space()='Open New Account']");
	
	public static By accountTypeSelect = By.xpath("//select[@id='type']");
	public static By newAccountClick = By.xpath("//input[@value='Open New Account']");
	
	
// Account Overview
	
	public static By accountOverviewClick = By.xpath("//a[normalize-space()='Accounts Overview']");
	
	public static By accountOverviewTableRow = By.xpath("//*[@id=\"accountTable\"]/tbody/tr");
	public static By accountOverviewTableColumn = By.xpath("//*[@id=\"accountTable\"]/thead/tr/th");
	
	
	
	
//	Tranasfer Funds 
	 public static By tranasferFundclick = By.xpath("//a[normalize-space()='Transfer Funds']");
	
	 public static By amountFillUp = By.xpath("//input[@id='amount']");
	 public static By fromAccountSelect = By.xpath("//select[@id='fromAccountId']");
	 public static By toAccountSelect = By.xpath("//select[@id='toAccountId']");
	 public static By submitAccount = By.xpath("//input[@value='Transfer']");
		
	
	
//	Bill pay 
	 public static By billPaytClick = By.xpath("//a[normalize-space()='Bill Pay']");
	 public static By pNmae= By.xpath("//input[@name='payee.name']");
	 public static By pAddress = By.xpath("//input[@name='payee.address.street']");
	 public static By pCity = By.xpath("//input[@name='payee.address.city']");
	 
	 public static By pState = By.xpath("//input[@name='payee.address.state']");
	 public static By pZipCode = By.xpath("//input[@name='payee.address.zipCode']");
	 public static By pPhone = By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[6]/td[2]/input");
	
	 
	 public static By pAccount = By.xpath("//input[@name='payee.accountNumber']");
	 public static By pVerifyAccount = By.xpath("//input[@name='verifyAccount']");
	 public static By pAmount = By.xpath("//input[@name='amount']");
	 public static By pFromAccount = By.xpath("//select[@name='fromAccountId']");
	 public static By pSubmitBillPayment = By.xpath("//input[@value='Send Payment']");
	
	 
		// Update Contact info , taken some field
	 public static By updateInfoClick = By.xpath("//a[normalize-space()='Update Contact Info']");
	 public static By updateAddress = By.xpath("//input[@id='customer.address.street']");
	 public static By updatePhone = By.xpath("//input[@id='customer.phoneNumber']");
	 public static By updateProfileBtn = By.xpath("//input[@value='Update Profile']");
		 
	 
	 
	// Request for Loan // it will create a account for given loan
	 public static By applyLoanClick = By.xpath("//a[normalize-space()='Request Loan']");
	 public static By loanAmount = By.xpath("//input[@id='amount']");
	 public static By downPayment = By.xpath("//input[@id='downPayment']");
	 public static By loanFromAccount = By.xpath("//select[@id='fromAccountId']");
	 public static By applyNowLoanSubmit = By.xpath("//input[@value='Apply Now']");
	 
	 
	 // Log Out
	 public static By logout = By.xpath("//a[normalize-space()='Log Out']");
	 
}
