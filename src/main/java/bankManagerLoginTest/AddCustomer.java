package bankManagerLoginTest;

import static core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseTest;
import page.AddCustomerPage;


public class AddCustomer extends BaseTest{
	
	private WebDriverWait wait;
	private Alert alert;
	private AddCustomerPage addCustomerPage;
	
	@Before
	public void initialize() {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\m_ara\\OneDrive\\Documentos\\geckdriver\\geckodriver.exe");
		getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		wait = new WebDriverWait(getDriver(), 5);
		addCustomerPage = new AddCustomerPage();
	}
	
	
	@Test
	public void addCustomer() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-primary btn-lg']")));
		addCustomerPage.bankManager();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class = 'btnClass1' and @class = 'btn btn-lg tab']")));
		addCustomerPage.addCustomer();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'First Name']")));
		addCustomerPage.addName("Matheus");
		addCustomerPage.addLastName("Silva");
		addCustomerPage.addPostCode("0000");
		
		addCustomerPage.finishCustomer();
		
		alert = getDriver().switchTo().alert();
		alert.accept();
	}

}
