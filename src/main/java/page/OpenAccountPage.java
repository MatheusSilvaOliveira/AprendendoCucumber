package page;


import core.BasePage;

public class OpenAccountPage extends BasePage{

	
	public void openAccount() {
		dsl.clickButton("//button[@ng-class = 'btnClass2' and @class = 'btn btn-lg tab']");
	}
	
	public void selectCustomer(String name) {
		dsl.selectCombo("//select[@id = 'userSelect']", name);
	}
	
	public void selectCurrency(String currency) {
		dsl.selectCombo("//select[@id = 'currency']", currency);
	}
	
	public void finishAccount() {
		dsl.clickButton("//button[contains(text(), 'Process')]");
	}
}
