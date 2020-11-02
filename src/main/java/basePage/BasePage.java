package basePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public static void selectDDByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
}
