package utilities;

import org.openqa.selenium.JavascriptExecutor;

public class ReusableMethods {

    public static void jsScroll() {

    JavascriptExecutor je = (JavascriptExecutor) Driver.getDriver();
        je.executeScript("window.scrollTo(0,document.body.scrollHeight)");


}
}
