package matheus.oliveira.teste.steps;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import page.AddCustomerPage;

public class InserirContaSteps extends BaseTest{
	
	private WebDriverWait wait;
	private Alert alert;
	private AddCustomerPage addCustomerPage;

	@Dado("^que eu acesse a página inicial do sistema$")
	public void queEuAcesseAPáginaInicialDoSistema() throws Throwable {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\m_ara\\OneDrive\\Documentos\\geckdriver\\geckodriver.exe");
		getDriver().get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
		wait = new WebDriverWait(getDriver(), 5);
		addCustomerPage = new AddCustomerPage();
	}

	@Dado("^em seguida no botão Bank Manager Login$")
	public void emSeguidaNoBotãoBankManagerLogin() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'btn btn-primary btn-lg']")));
		addCustomerPage.bankManager();
	}

	@Dado("^em seguida no botão Add Customer$")
	public void emSeguidaNoBotãoAddCustomer() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-class = 'btnClass1' and @class = 'btn btn-lg tab']")));
		addCustomerPage.addCustomer();
	}

	@Quando("^eu informar o nome (.*)$")
	public void euInformarONome(String arg1) throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'First Name']")));
		addCustomerPage.addName(arg1);
	}

	@Quando("^o sobrenome (.*)$")
	public void oSobrenome(String arg1) throws Throwable {
		addCustomerPage.addLastName(arg1);
	}

	@Quando("^o CEP (.*)$")
	public void oCEP(String arg1) throws Throwable {
		addCustomerPage.addPostCode(arg1);
	}
	
	@Dado("^em seguida finalizo no botão Add Customer$")
	public void emSeguidaNoBotãoAddCustomerFinal() throws Throwable {
		addCustomerPage.finishCustomer();
	}

	@Entao("^fecho o alerta que aparece$")
	public void fechoOAlertaQueAparece() throws Throwable {
		alert = getDriver().switchTo().alert();
		alert.accept();
	}
	
}
