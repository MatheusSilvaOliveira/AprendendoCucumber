package page;

import core.BasePage;

public class LogInPage extends BasePage {
	
	public void customerLogin() {
		dsl.clickButton("//button[@class = 'btn btn-primary btn-lg' and @ng-click = 'customer()']");
	}
	
	public void selectCustomer(String name) {
		dsl.selectCombo("//select[@id = 'userSelect']", name);
	}
	
	public void clickLogIn() {
		dsl.clickButton("//button[@class = 'btn btn-default' and contains(text(), 'Login')]");
	}

}
