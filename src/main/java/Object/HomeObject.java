package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeObject extends AbstractObject{

    public HomeObject(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "answer1")
    public WebElement fieldNumberOne;

    @FindBy (id = "name")
    public WebElement fieldName;

    @FindBy (id = "occupation")
    public WebElement  occupation;

    @FindBy (className = "bluebox")
    public WebElement blueBox;

    @FindBy (id = "answer4")
    public WebElement field4;

    @FindBy (linkText = "click me")
    public WebElement clickMe;

    @FindBy (id = "redbox")
    public WebElement redBox;

    @FindBy (id = "answer6")
    public WebElement field6;

    @FindBy (id = "answer10")
    public WebElement field10;

//    @FindBy (xpath = "/html/body/span[5]")
//    public WebElement whichBox;

    @FindBy (id ="greenbox")
    public WebElement greenBox;

    @FindBy (id = "orangebox")
    public WebElement orangeBox;

    @FindBy (id = "answer11")
    public WebElement field11;

    @FindBy (id = "answer13")
    public WebElement field13;

    @FindBy (id = "ishere")
    public WebElement ishare;

    @FindBy (id= "purplebox")
    public WebElement purpleBox;

    @FindBy (id = "answer14")
    public WebElement field14;

    @FindBy (linkText = "click then wait")
    public WebElement clickThenWait;

    @FindBy (linkText = "click after wait")
    public WebElement clickAfterWait;

    @FindBy (id = "submitbutton")
    public WebElement submit;

    @FindBy (xpath = "//*[@id=\"testform\"]/input[2]")
    public WebElement wroteBook;

    @FindBy (id ="checkresults")
    public WebElement checkResult;

    @FindBy (id ="answer8")
    public WebElement field8;
}
