package core;

import static core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	public void clickButton(String xpath) {
		getDriver().findElement(By.xpath(xpath)).click();
	}

	public void insertData(String xpath, String data) {
		getDriver().findElement(By.xpath(xpath)).sendKeys(data);;
	}
	
	public void selectCombo(String xpath, String name) {
		WebElement element = getDriver().findElement(By.xpath(xpath));
		Select combo = new Select(element);
		
		combo.selectByVisibleText(name);
	}
	
	public String getText(String xpath) {
		return getDriver().findElement(By.xpath(xpath)).getText();
	}
	
	public void usingTable(String colunFind, String name, String buttonFind) {
		WebElement table = getDriver().findElement(By.xpath("//table[@class = 'table table-bordered table-striped']"));
		
		int idColun = getColun(colunFind, table);
		
		int idRow = getRow(idColun, table, name);
		
		int idColunButton = getColun(buttonFind, table);
		
		WebElement buttonDelete = table.findElement(By.xpath("./tbody/tr["+idRow+"]/td["+idColunButton+"]"));
		buttonDelete.findElement(By.xpath(".//button[contains(text(), 'Delete')]")).click();;
	}

	private int getRow(int idColun, WebElement table, String name) {
		List<WebElement> row = table.findElements(By.xpath("./tbody//td["+idColun+"]"));
		int idRow = -1;
		for(int i = 0; i < row.size(); i++) {
			if(row.get(i).getText().equals(name)) {
				idRow = i + 1;
				break;
			}
		}
		return idRow;
	}

	
	private int getColun(String colunFind, WebElement table) {
		List<WebElement> colun = table.findElements(By.xpath("./thead//td"));
		int idColun = -1;
		for(int i = 0; i < colun.size(); i++) {
			if(colun.get(i).getText().equals(colunFind)) {
				idColun = i + 1;
				break;
			}
		}
		return idColun;
	}
	
	
	
	
	public void usingTableTransction(String colunFind, String name, String dateTime) {
		WebElement table = getDriver().findElement(By.xpath("//table[@class = 'table table-bordered table-striped']"));
		
		int idColun = getColunTransction(colunFind, table);
		
		List<Integer> idRow = getRowTransction(idColun, table, name);
		
		int idDateTime = getColunTransction(dateTime, table);

		for(int i = 0; i <= idRow.size(); i++) {
			System.out.println(table.findElement(By.xpath("./tbody/tr["+idRow.get(i)+"]/td["+idDateTime+"]")).getText());
		}
		
	}
	
	private List<Integer> getRowTransction(int idColun, WebElement table, String name) {
		List<WebElement> row = table.findElements(By.xpath("./tbody//td["+idColun+"]"));
		List<Integer> idRow = new ArrayList<Integer>();
		for(int i = 0; i < row.size(); i++) {
			if(row.get(i).getText().equals(name)) {
				idRow.add(i + 1);
			}
		}
		return idRow;
	}
	
	
	private int getColunTransction(String colunFind, WebElement table) {
		List<WebElement> colun = table.findElements(By.xpath("./thead//td"));
		int idColun = -1;
		for(int i = 0; i < colun.size(); i++) {
			if(colun.get(i).getText().equals(colunFind)) {
				idColun = i + 1;
				break;
			}
		}
		return idColun;
	}
}
