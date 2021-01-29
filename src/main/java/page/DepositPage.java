package page;

import core.BasePage;

public class DepositPage extends BasePage {
	
	public void clickDeposit() {
		dsl.clickButton("//button[@class = 'btn btn-lg tab' and @ng-click = 'deposit()']");
	}

	public void confirmDeposit() {
		dsl.clickButton("//button[@class = 'btn btn-default' and contains(text(), 'Deposit')]");
	}
	
	public void inserDeposit(String amount) {
		dsl.insertData("//input[@placeholder = 'amount']", amount);
	}

}
