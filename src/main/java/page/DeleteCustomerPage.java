package page;

import core.BasePage;

public class DeleteCustomerPage extends BasePage {
	
	public void Customer() {
		dsl.clickButton("//button[@ng-class = 'btnClass3' and @class = 'btn btn-lg tab']");
	}
	
	public void insertCustomer(String name) {
		dsl.insertData("//input[@placeholder = 'Search Customer']", name);
	}
	
	public void deleteCustomer(String name) {
		dsl.usingTable("First Name", name, "Delete Customer");
	}

}
