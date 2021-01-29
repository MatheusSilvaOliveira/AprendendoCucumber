package customerLoginTest;

import static core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseTest;
import page.DepositPage;
import page.LogInPage;

public class Deposit extends BaseTest {
	
	private WebDriverWait wait;
	private LogInPage logInPage;
	private DepositPage depositPage;
	
	@Before
	public void initialize() {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\m_ara\\OneDrive\\Documentos\\geckdriver\\geckodriver.exe");
		getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		wait = new WebDriverWait(getDriver(), 5);
		logInPage = new LogInPage();
		depositPage = new DepositPage();
	}
	
	@Test
	public void DepositValue() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-primary btn-lg']")));
		logInPage.customerLogin();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id = 'userSelect']")));
		logInPage.selectCustomer("Harry Potter");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-default' and contains(text(), 'Login')]")));
		logInPage.clickLogIn();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-lg tab' and @ng-click = 'deposit()']")));
		depositPage.clickDeposit();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'amount']")));
		depositPage.inserDeposit("12");
		depositPage.confirmDeposit();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[@ng-show = 'message']"), "Deposit Successful"));
		
	}
}
