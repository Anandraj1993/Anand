package org.petstore;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	WebElement element = driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']"));
	element.click();
	WebElement table = driver.findElement(By.id("Catalog"));
	 List<WebElement> rows = table.findElements(By.tagName("tr"));
//	 for (int i = 0; i <rows.size(); i++) {
		WebElement data = rows.get(1);
		List<WebElement> datas = data.findElements(By.tagName("td"));
//			for (int j = 0; j <datas.size(); j++) {
				WebElement dataas = datas.get(0);
				String text = dataas.getText();
				System.out.println(text);
				dataas.click();
//			}
//	 }

}
}
