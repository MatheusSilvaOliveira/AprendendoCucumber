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
import page.OpenAccountPage;

public class OpenAccount extends BaseTest{

	private WebDriverWait wait;
	private AddCustomerPage addCustomerPage;
	private OpenAccountPage openAccountPage;
	private Alert alert;
	
	@Before
	public void initialize() {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\m_ara\\OneDrive\\Documentos\\geckdriver\\geckodriver.exe");
		getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		wait = new WebDriverWait(getDriver(), 5);
		addCustomerPage = new AddCustomerPage();
		openAccountPage = new OpenAccountPage();
	}
	
	@Test
	public void Open() {
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-primary btn-lg']")));
		addCustomerPage.bankManager();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class = 'btnClass2' and @class = 'btn btn-lg tab']")));
		openAccountPage.openAccount();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id = 'userSelect']")));
		openAccountPage.selectCustomer("Harry Potter");
		
		//Dollar or Pound or Rupee
		openAccountPage.selectCurrency("Pound");
		
		openAccountPage.finishAccount();
		
		alert = getDriver().switchTo().alert();
		alert.accept();
		
	}
	
}
