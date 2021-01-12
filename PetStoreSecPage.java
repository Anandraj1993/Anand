package org.petstore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetStoreSecPage extends BaseClass {
public PetStoreSecPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="Catalog")

private WebElement parrotClick;
public WebElement getParrotClick() {
	return parrotClick;
}
@FindBy(tagName="tr")
private List<WebElement> row= new ArrayList<WebElement>();
public List<WebElement> getRow() {
	return row;
}
@FindBy(tagName="td")
private List<WebElement> data= new LinkedList<WebElement>();
public List<WebElement> getData() {
	return data;
}

}




