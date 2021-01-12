package org.petstore;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver launchBrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void quitWindow() {
		driver.quit();
	}

	public void sendKeys(WebElement element, String url) {
		element.sendKeys(url);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public WebElement findElementById(String id) {
		return driver.findElement(By.id(id));
	}

	public WebElement findElementByName(String name) {
		return driver.findElement(By.name(name));
	}

	public WebElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public List<WebElement> findElementsById(String id) {
		return driver.findElements(By.id(id));
	}

	public List<WebElement> findElementsByXpath(String xpath) {
		return driver.findElements(By.xpath(xpath));

	}

	public String getProductText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void keyBoardKeys() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void findElementsByTableDatas(String id) {
		 WebElement table = driver.findElement(By.id(id));
		 List<WebElement> rows = table.findElements(By.tagName("tr"));
		 for (int i = 0; i <rows.size(); i++) {
			WebElement data = rows.get(i);
			List<WebElement> datas = data.findElements(By.tagName("td"));
				for (int j = 0; j <datas.size(); j++) {
					WebElement dataas = datas.get(j);
					String text = dataas.getText();
				}
		 }
	
	
	}
}
