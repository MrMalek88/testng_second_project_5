package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class UnitedAirlinesBasePage {

    public UnitedAirlinesBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "a[id*='headerNav']")
    public List<WebElement> headerOptions;

    @FindBy (css = "ul[class*=bookTravel] h2")
    //@FindBy (css = "div[class*='travelSection']")
    public List<WebElement> bookHeaders;

    @FindBy(css = "label[for*='roundtrip']")
    public List<WebElement> roundTripLabel;

    @FindBy(id = "roundtrip")
    public List<WebElement> roundTripButton;

    @FindBy(css = "label[for*='oneway']")
    public List<WebElement> oneWayLabel;

    @FindBy(id = "oneway")
    public List<WebElement> oneWayButton;

  @FindBy (css = "label[for=award]" )
  public List<WebElement> bookWithMilesLabel;

    @FindBy (css = "input[name=AwardTravel]" )
    public List<WebElement> bookWithMilesButton;

    @FindBy(id = "flexibleDates")
    public List<WebElement> flexibleDatesButton;

    @FindBy(css = "label[for*='flexibleDates']")
    public List<WebElement> flexibleDatesLabel;

    @FindBy(id = "bookFlightOriginInput")
    public WebElement fromInputBox;

    @FindBy(id = "bookFlightDestinationInput")
    public WebElement toInputBox;

    @FindBy(id = "DepartDate")
    public WebElement datesBox;

    @FindBy(id = "passengerMenuId")
    public List<WebElement> travelSelector;

    @FindBy(xpath = "//*[@id=\'cabinType\']/span")
    public List<WebElement> cabinDropdown;


    @FindBy(xpath = "//*[@id=\"cabinType\"]")
    public List<WebElement> businessFirstClassDropdown;

    @FindBy(css = "button[class*=w8CX7]")
    public List<WebElement> travelButton;

    @FindBy(xpath = "[@id=\"bookFlightForm\"]/div[5]/div/div[1]/div/div/div[2]/button[1]")
    public List<WebElement> fingFlightsButton;

}