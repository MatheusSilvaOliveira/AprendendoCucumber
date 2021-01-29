package page;

import core.BasePage;

public class TransactionPage extends BasePage {

	public void clickTransaction() {
		dsl.clickButton("//button[@class = 'btn btn-lg tab' and @ng-click = 'transactions()']");
	}
	
	public void printTransaction(String transaction) {
		dsl.usingTableTransction("Transaction Type", transaction, dsl.getText("//a [contains(@ng-click, 'sortType')]"));
	}
	
}
