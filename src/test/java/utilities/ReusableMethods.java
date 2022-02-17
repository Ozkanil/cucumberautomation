package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ReusableMethods {

    public static void jsScroll() {

    JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
        je.executeScript("window.scrollTo(0,document.body.scrollHeight)");

}
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }
}
