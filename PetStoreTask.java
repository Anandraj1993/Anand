package org.petstore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PetStoreTask extends BaseClass {
	BaseClass base = new BaseClass();
	public static PetStoreFirstPage firstpage;
	public static PetStoreSecPage secpage;

	@BeforeClass
	private void getBrowser() {
		base.launchBrowser();

	}

	@BeforeMethod
	private void getUrl() throws InterruptedException {
		Thread.sleep(2000);
		base.launchUrl("https://petstore.octoperf.com/actions/Catalog.action");

		firstpage = new PetStoreFirstPage();
	}

	@Test(priority = 1)
	private void selectPet() throws InterruptedException {
		
		base.btnClick(firstpage.getBirdsBtn());
		secpage = new PetStoreSecPage();
		Thread.sleep(3000);
//		Thread.sleep(3000);
	}

	@Test(priority = 2)
		private void selectParrot() throws InterruptedException {
		Thread.sleep(3000);
		WebElement click = base.findElementById("Catalog");
		List<WebElement> row = click.findElements(By.tagName("tr"));
		WebElement element = row.get(1);
		List<WebElement> elements = element.findElements(By.tagName("td"));
		WebElement element2 = elements.get(0);
		element2.click();	
		
	}
}	
		
		
		
		
		
		
		
		
		
////		WebElement table = secpage.getParrotClick();
//		
//		WebElement table = base.findElementById("Catalog");
//		Thread.sleep(3000);
//		List<WebElement> list = table.findElements(By.tagName("tr"));
//		WebElement row = list.get(1);
//		List<WebElement> list2 = row.findElements(By.tagName("td"));
//		WebElement data = list2.get(0);
//		String text = data.getText();
//		System.out.println(text);
//		data.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		base.findElementsByTable();;
//	List<WebElement> table = secpage.getParrotClick();
//	
//	 List<WebElement> rows = table.findElements(By.tagName("tr"));
//	 for (int i = 0; i <rows.size(); i++) {
//		WebElement data = rows.get(i);
//		List<WebElement> datas = data.findElements(By.tagName("td"));
//			for (int j = 0; j <datas.size(); j++) {
//				WebElement dataas = datas.get(j);
//				String text = dataas.getText();
//			}
//	 }
//	}
//}
//}