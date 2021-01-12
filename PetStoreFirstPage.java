package org.petstore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetStoreFirstPage extends BaseClass {
	public PetStoreFirstPage() {
PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//img[@src='../images/birds_icon.gif']")
private WebElement birdsBtn;
public WebElement getBirdsBtn() {
	return birdsBtn;
}


}
