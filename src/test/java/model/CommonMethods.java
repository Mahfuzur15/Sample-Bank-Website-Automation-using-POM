package model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	WebDriver driver;
	public CommonMethods(WebDriver driver) {
		this.driver = driver ;
	}

	// Register
	
	public void fNameSend(By fname, String value1) {
		driver.findElement(fname).sendKeys(value1);
	}
	
	public void lNameSend(By lname, String value2) {
		driver.findElement(lname).sendKeys(value2);
	}
	

	public void adrsSend(By adrs, String value3) {
		driver.findElement(adrs).sendKeys(value3);
	}
	
	public void citySend(By city, String value4) {
		driver.findElement(city).sendKeys(value4);
	}
	 
	public void stateSend(By state, String value5) {
		driver.findElement(state).sendKeys(value5);
	}
	
	public void zCodeSend( By zcode, String value6) {
		driver.findElement(zcode).sendKeys(value6);
	}
	
	public void phoneSend(By phone, String value7) {
		driver.findElement(phone).sendKeys(value7);
	}
	
	public void ssnSend(By ssn, String value8) {
		driver.findElement(ssn).sendKeys(value8);
	}
	
	
	public void uNameSend(By uname, String value9) {
		driver.findElement(uname).sendKeys(value9);
	}
	
	public void passwsrdSend(By pass, String value10) {
		driver.findElement(pass).sendKeys(value10);
	}
	
	
	public void cPasswrdSend(By cpass, String value11) {
		driver.findElement(cpass).sendKeys(value11);
	}
	
	// Register Button Click
	public void registerBtnClick(By element) {
		driver.findElement(element).click();
	}
		
// Login 
	
	public void userNameSend(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	
	public void passwordSend(By pass, String value) {
		driver.findElement(pass).sendKeys(value);
	}
		
	// login button Click
	
	public void loginAccount(By btn) {
		driver.findElement(btn).click();
	}

	
//	Click Create new account
		
	public void clickCreateAccount(By btn) {
			driver.findElement(btn).click();
		}
		
//	Create new account	
	public void createAccount(By btn, int value) {
		Select type = new Select(driver.findElement(btn));
	type.selectByIndex(value);  // index 0,1
	}
	
	// Submit account click 
	
	public void submitCreateAccount(By btn) {
		driver.findElement(btn).click();
	}
	
	// OverView 
	
	public void overviewClick(By btn) {
		driver.findElement(btn).click();
	}
	
	public void overviewTableGet(By column, By row) {
		
		List<WebElement> colelements = driver.findElements(column);
		System.out.println(colelements.size());
		
		for (int j = 1; j<=colelements.size(); j++) {
			
			System.out.print(driver.findElement(By.xpath("//*[@id='accountTable']/thead/tr/th[" + j + "]")).getText() + "  ");
		}
		System.out.println();
		
 		List<WebElement> rowelements = driver.findElements(row);
 		
 		for (int i = 1; i<=rowelements.size(); i++) {
 			for (int j = 1; j<=colelements.size(); j++) {
				
				System.out.print(driver.findElement(By.xpath("//*[@id='accountTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText() + "    ");
			}
			System.out.println();
 		}
 		
		System.out.println(rowelements.size());	
	}
	
	
	
//	Tranasfer Funds
	
	public void clickTranasferFund (By element) {
		driver.findElement(element).click();;
	}
	
	public void amountSend (By element, String amount) {
		driver.findElement(element).sendKeys(amount);
	}
	
	public void fromAccount(By btn, int value) {  
		Select type = new Select(driver.findElement(btn));
		type.selectByIndex(value);  // index 0,1
	}
	
	public void toAccount(By btn, int value) {
		Select type = new Select(driver.findElement(btn));
		type.selectByIndex(value);  // index 0,1
	}
	
	public void submitAccountTranasfer(By btn) {
		driver.findElement(btn).click();
	}

	
	

	// Bill Pay
	public void billPayClick(By element) {
		driver.findElement(element).click();;
	}
	
	public void pNameSend(By fname, String value1) {
		driver.findElement(fname).sendKeys(value1);
	}
	
	public void pAdrsSend(By adrs, String value3) {
		driver.findElement(adrs).sendKeys(value3);
	}
	
	public void pCitySend(By city, String value4) {
		driver.findElement(city).sendKeys(value4);
	}
	 
	public void pStateSend(By state, String value5) {
		driver.findElement(state).sendKeys(value5);
	}
	
	public void pZCodeSend( By zcode, String value6) {
		driver.findElement(zcode).sendKeys(value6);
	}
	
	public void pPhoneSend(By phone, String value7) {
		driver.findElement(phone).sendKeys(value7);
	}
	
	public void pBillPayAccountSend(By ssn, String value8) {
		driver.findElement(ssn).sendKeys(value8);
	}
	
	
	public void pVerifyBillPayAccountSend(By uname, String value9) {
		driver.findElement(uname).sendKeys(value9);
	}
	
	public void pAmountSend(By amnt, String value10) {
		driver.findElement(amnt).sendKeys(value10);
	}
	
	
	public void pFromAccountSend(By acnt, int value) {
		Select type = new Select(driver.findElement(acnt));
		type.selectByIndex(value);
	}
	
	public void pSubmitBillPayment(By btn) {
		driver.findElement(btn).click();
	}

	
	
	// Update Contact Info
	
	public void updateContactInfoClick(By btn) {
		driver.findElement(btn).click();
	}
	
	
	public void updateAddressSend(By btn, String value) {
		driver.findElement(btn).sendKeys(value);
	}
	
	public void updatePhoneSend(By element, String value) {
		driver.findElement(element).sendKeys(value);
	}
	
	
	public void submitUpdateContactInfo(By btn) {
		driver.findElement(btn).click();
	}
	
	
	
	
	
	// Request for a loan
	
	public void applyLoanClick(By btn) {
		driver.findElement(btn).click();
	}
	
	
	public void loanAmountSend(By amnt, String value) {
		driver.findElement(amnt).sendKeys(value);
	}
	
	public void downPaymentSend(By amnt, String value) {
		driver.findElement(amnt).sendKeys(value);
	}
	
	
	public void loanFromAccount(By acnt, int value) {
		Select type = new Select(driver.findElement(acnt));
		type.selectByIndex(value);
	}
	
	public void submitLoanRequest(By btn) {
		driver.findElement(btn).click();
	}
	
	// Log Out 
	public void logout(By btn) {
		driver.findElement(btn).click();
	}
	
	
	
}
