package page;


import core.DSL;

public class AddCustomerPage {

	private DSL dsl;
	
	
	public AddCustomerPage() {
		dsl = new DSL();
	}
	
	public void bankManager() {
		dsl.clickButton("//button[contains(text(), 'Bank Manager Login') and @class = 'btn btn-primary btn-lg']");
	}
	
	public void addCustomer() {
		dsl.clickButton("//button[@ng-class = 'btnClass1' and @class = 'btn btn-lg tab']");
	}
	
	public void finishCustomer() {
		dsl.clickButton("//button[contains(text(), 'Add Customer') and @class = 'btn btn-default']");
	}
	
	public void addName(String name) {
		dsl.insertData("//input[@placeholder = 'First Name']", name);
	}
	
	public void addLastName(String lastname) {
		dsl.insertData("//input[@placeholder = 'Last Name']", lastname);
	}
	
	public void addPostCode(String postcode) {
		dsl.insertData("//input[@placeholder = 'Post Code']", postcode);
	}
	
}
