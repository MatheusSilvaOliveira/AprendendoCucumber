package page;

import core.BasePage;

public class WithdrawlPage extends BasePage {

	public void clickWithdrawl() {
		dsl.clickButton("//button[@class = 'btn btn-lg tab' and @ng-click = 'withdrawl()']");
	}
	
	public void inserWithdrawl(String amount) {
		dsl.insertData("//input[@placeholder = 'amount']", amount);
	}
	
	public void confirmWithdrawl() {
		dsl.clickButton("//button[@class = 'btn btn-default' and contains(text(), 'Withdraw')]");
	}
	
	public void sleep() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
	}
}
