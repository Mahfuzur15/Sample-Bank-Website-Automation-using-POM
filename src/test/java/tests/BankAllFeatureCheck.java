package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import model.CommonMethods;
import model.Locators;
import model.Timeout;
import pages.HomePage;

public class BankAllFeatureCheck {

	// Base class object Create
		Base base = new Base();
	
		WebDriver driver = base.setup();

		CommonMethods commonMethods = new CommonMethods(driver);
		HomePage homePage = new HomePage(driver);
		Timeout time = new Timeout();
		
		@BeforeClass
		public void start() {
			driver.get(homePage.bankPageUrl());
		}
		
		@Test
		public void DarazBuyTest() throws InterruptedException {
		
			// Login 
			logIn();
//			
			time.timeout();
			
			// Registration
//			Registration();
			
//			Create new Account
			CreateNewAccount();
			
			
//			Overview 
			OverViewCheck();
			
//			Tranasfer Fund 
			TranasferFund ();
			
			
//			Bill Pay
				
			BillPay();
	
				time.timeout();
				time.timeout();
//				Update Contact Info
				
			UpdateContactInfo();
				
//			Request For A loan
			
				RequestLoan();
				
				time.timeout();
				
				//  Logout 
				commonMethods.logout(Locators.logout);
				
			time.timeout();
			time.timeout();
			
			base.tearDown();
		}
			
		public void logIn () {
			commonMethods.userNameSend(Locators.username, "tus68");
			commonMethods.passwordSend(Locators.password, "123456");
			commonMethods.loginAccount(Locators.loginBtn);
		}
		
		public void CreateNewAccount () {
			commonMethods.clickCreateAccount(Locators.openAccountClick);
			time.timeout();
			commonMethods.createAccount(Locators.accountTypeSelect, 1);
			commonMethods.submitCreateAccount(Locators.newAccountClick);
			time.timeout();
		}
		
		
	public void Registration () {
	
		commonMethods.registerBtnClick(Locators.regigterClick);
		
		commonMethods.fNameSend(Locators.fName, "tushar");
		commonMethods.lNameSend(Locators.lName, "tushar");

		commonMethods.adrsSend(Locators.address, "College road, Chowmuhani");
		commonMethods.citySend(Locators.city, "Chittagong");
		commonMethods.stateSend(Locators.state, "Chittagong");
		
		time.timeout();
		
		commonMethods.zCodeSend(Locators.zipCode, "3435");
		commonMethods.phoneSend(Locators.phone, "016117981");
		
		commonMethods.ssnSend(Locators.ssn, "454-354");
		
		time.timeout();
		
		commonMethods.uNameSend(Locators.uName, "tus68");
		commonMethods.passwsrdSend(Locators.pass, "123456");
		time.timeout();
		commonMethods.cPasswrdSend(Locators.cPass, "123456");
		
		commonMethods.registerBtnClick(Locators.registerBtnClick);
		
	}
	
	public void OverViewCheck() {
		
		commonMethods.overviewClick(Locators.accountOverviewClick);
		time.timeout();
		commonMethods.overviewTableGet(Locators.accountOverviewTableColumn, Locators.accountOverviewTableRow );
	}
	

	public void TranasferFund () {
		commonMethods.clickTranasferFund(Locators.tranasferFundclick);
		time.timeout();
		commonMethods.amountSend(Locators.amountFillUp, "200"); // Number of amount for send
		time.timeout();
		commonMethods.fromAccount(Locators.fromAccountSelect, 2); // type account index number
		time.timeout();
		commonMethods.toAccount(Locators.toAccountSelect, 1); // type account number
		time.timeout();
		commonMethods.submitAccountTranasfer(Locators.submitAccount);
	}
	
	public void BillPay() {
		
		commonMethods.billPayClick(Locators.billPaytClick);
		
		commonMethods.pNameSend(Locators.pNmae, "Tushar");

		commonMethods.pAdrsSend(Locators.pAddress, "College road, Chowmuhani");
		commonMethods.pCitySend(Locators.pCity, "Dhaka");
		commonMethods.pStateSend(Locators.pState, "Dhaka");
		
		time.timeout();
		
		commonMethods.pZCodeSend(Locators.pZipCode, "1208");
		commonMethods.pPhoneSend(Locators.pPhone, "016117981");
					
		time.timeout();
		
		commonMethods.pBillPayAccountSend(Locators.pAccount, "232-232");   // Electricity account number send
		commonMethods.pVerifyBillPayAccountSend(Locators.pVerifyAccount, "232-232");
		time.timeout();
		commonMethods.pAmountSend(Locators.pAmount, "200");  // bill amount
		time.timeout();
		commonMethods.pFromAccountSend(Locators.pFromAccount, 1); // passing account index number
		
		commonMethods.pSubmitBillPayment(Locators.pSubmitBillPayment);
	}
	
	
	public void RequestLoan() {
		
		commonMethods.applyLoanClick(Locators.applyLoanClick);
		
		commonMethods.loanAmountSend(Locators.loanAmount, "150");

		commonMethods.downPaymentSend(Locators.downPayment, "20");
		commonMethods.loanFromAccount(Locators.loanFromAccount, 2);
		commonMethods.submitLoanRequest(Locators.applyNowLoanSubmit);
	}
	
	
	public void UpdateContactInfo() {
		
		commonMethods.updateContactInfoClick(Locators.updateInfoClick);
		time.timeout();
		commonMethods.updateAddressSend(Locators.updateAddress, "Gulsan, Banani");

		commonMethods.updatePhoneSend(Locators.updatePhone, "0162489");
		commonMethods.submitUpdateContactInfo(Locators.updateProfileBtn);
	}
	
	
}
