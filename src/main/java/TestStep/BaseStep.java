package TestStep;

import Test.TestRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import Object.*;

public class BaseStep {

    public static HomeObject objHome = new HomeObject(TestRunner.driver);

    public WebDriverWait wt = new WebDriverWait(TestRunner.driver,55);

    public void implicitWait(Integer time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {

        }
    }
}
