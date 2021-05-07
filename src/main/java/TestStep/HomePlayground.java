package TestStep;

import Test.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePlayground extends BaseStep{

    @Given("User input title of page")
    public void homePage(){
        String title = TestRunner.driver.getTitle();
        objHome.fieldNumberOne.sendKeys(title);

    }

    @And("User input field name with {string}")
    public void userInputFieldNameWith(String name) {
        objHome.fieldName.sendKeys(name);
    }

    @And("user set occupation on form to Sci-Fi Author")
    public void userSetOccupationOnFormToSciFiAuthor() {
        Select occupation = new Select(objHome.occupation);
        occupation.selectByValue("scifiauthor");

    }

    @And("User count number of blue box and enter field number")
    public void userCountNumberOfBlueBoxAndEnterFieldNumber() {

        int blueBoxCount = TestRunner.driver.findElements(By.className("bluebox")).size();
        objHome.field4.sendKeys(Integer.toString(blueBoxCount));


    }

    @And("User click link by link text")
    public void userClickLinkByLinkText() {
        objHome.clickMe.click();

    }

    @And("User find class to input field")
    public void userFindClassToInputField() {
        String className = objHome.redBox.getAttribute("class");
        objHome.field6.sendKeys(className);

    }

    @And("User ran JS script")
    public void userRanJSScript() {
        JavascriptExecutor jse = (JavascriptExecutor)TestRunner.driver;
        jse.executeScript("ran_this_js_function()");

    }

    @And("User ran JS script input class value into field")
    public void userRanJSScriptInputClassValueIntoField() {
        JavascriptExecutor jse = (JavascriptExecutor)TestRunner.driver;
        String  value = jse.executeScript("return got_return_from_js_function()").toString();
        objHome.field8.sendKeys(value);
    }

    @And("User mark radio button to yes")
    public void userMarkRadioButtonToYes() {
        objHome.wroteBook.click();

    }

    @And("User get text from red box to input into field")
    public void userGetTextFromRedBoxToInputIntoField() {
        String textRedBox = objHome.redBox.getText();
        objHome.field10.sendKeys(textRedBox);
    }

    @And("User find which color is on top to input into field")
    public void userFindWhichColorIsOnTopToInputIntoField() {
        Point greenLocation = objHome.greenBox.getLocation();
        Point orangeLocation = objHome.orangeBox.getLocation();
        int yGreen = greenLocation.y;
        int yOrange = orangeLocation.y;

        if (yGreen < yOrange){
            objHome.field11.sendKeys("green");
        } else objHome.field11.sendKeys("orange");

    }

    @And("User set browser width {int}  and height {int}")
    public void userSetBrowserWidthAndHeight(int width, int height) {
        Dimension dim = new Dimension(width,height);
        TestRunner.driver.manage().window().setSize(dim);
    }

    @And("User is there item with id on the page")
    public void userIsThereItemWithIdOnThePage() {

        try {
            objHome.ishare.isDisplayed();{
                objHome.field13.sendKeys("yes");
            }
        } catch (Exception e) {
            objHome.field13.sendKeys("no");
        }
    }

    @And("User check if purple box visible or not")
    public void userCheckIfPurpleBoxVisibleOrNot() {
        WebDriverWait wtShort = new WebDriverWait(TestRunner.driver,1);
        try {
            if (wtShort.until(ExpectedConditions.visibilityOf(objHome.purpleBox))!=null){
                objHome.field14.sendKeys("yes");
                implicitWait(5);
            }
        } catch (Exception e) {
            objHome.field14.sendKeys("no");
            implicitWait(5);
        }
    }

    @And("User click link then wait until new link appear then click")
    public void userClickLinkThenWaitUntilNewLinkAppearThenClick() {
        WebDriverWait wtShort = new WebDriverWait(TestRunner.driver,11);
        objHome.clickThenWait.click();
        wtShort.until(ExpectedConditions.visibilityOf(objHome.clickAfterWait)).click();


    }

    @And("User click Ok after complete")
    public void userClickOkAfterComplete() {
        TestRunner.driver.switchTo().alert().accept();
    }

    @Then("User click submit")
    public void userClickSubmit() {
        objHome.submit.click();
        objHome.checkResult.click();
        JavascriptExecutor jse = (JavascriptExecutor)TestRunner.driver;
        jse.executeScript("window.scrollTo(0,-250, document.body.scrollHeight)");
        implicitWait(10);
    }


}
