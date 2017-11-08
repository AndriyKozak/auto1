package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.AbstractPageObject;
import utils.url.UrlFactory;

import java.util.List;

public class OurCarsPage extends AbstractPageObject {

    @FindBy(css = ".select2-selection.select2-selection--multiple")
    private WebElement selectManufactures;

    @FindBy(css = ".checkbox-list.manufacturers-list > li:nth-of-type(6) > .checkbox")
    private WebElement checkboxBMW;

    @FindBy(css = ".car-name")
    List<WebElement> carNameList;

    @FindBy(css = ".car-img > img")
    private List<WebElement> carImgList;

    @FindBy(xpath = "//*[@id='car-list']//tr[1]//td[2]")
    private List<WebElement> allValueStockNumberFromCarsList;

    @FindBy(xpath = "//*[@id='car-list']//tr[2]//td[2]")
    private List<WebElement> allValueMileageFromCarsList;

    @FindBy(xpath = "//*[@id='car-list']//tr[3]//td[2]")
    private List<WebElement> allValueRegistrationFromCarsList;

    @FindBy(xpath = "//*[@id='car-list']//tr[4]//td[2]")
    private List<WebElement> allValueHorsepowerFromCarsList;

    @FindBy(xpath = "//*[@id='car-list']//tr[5]//td[2]")
    private List<WebElement> allValueBodyTypeFromCarsList;

    @FindBy(xpath = "//*[@id='car-list']//tr[6]//td[2]")
    private List<WebElement> allValueFuelTypeFromCarsList;

    @FindBy(xpath = "//*[@id='car-list']//tr[7]//td[2]")
    private List<WebElement> allValueGearBoxFromCarsList;

    public OurCarsPage(WebDriver driver) {
        super(driver);
    }

    public void openOurCarsPage() {
        driver.get(UrlFactory.getUrl().toString());
    }

    public void selectFilterBMW() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();"
                , checkboxBMW);

        checkboxBMW.click();
    }

    public String getSelectedManufacturesInSelect() {
        return selectManufactures.getText();
    }


    public void checkAllImagesOfCars() {

        for (int i = 0; i < carImgList.size(); i++) {
            Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof " +
                    "arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", carImgList.get(i));

            if (!ImagePresent) {
                System.out.println("Image of the " + (i + 1) + " car not displayed.");
            } else {
                System.out.println("Image of the " + (i + 1) + " car was displayed.");
            }
        }
    }

    public List<WebElement> getCarNameList() {
        return carNameList;
    }

    public List<WebElement> getAllValueStockNumberFromCarsList() {
        return allValueStockNumberFromCarsList;
    }

    public List<WebElement> getAllValueMileageFromCarsList() {
        return allValueMileageFromCarsList;
    }

    public List<WebElement> getAllValueRegistrationFromCarsList() {
        return allValueRegistrationFromCarsList;
    }

    public List<WebElement> getAllValueHorsepowerFromCarsList() {
        return allValueHorsepowerFromCarsList;
    }

    public List<WebElement> getAllValueBodyTypeFromCarsList() {
        return allValueBodyTypeFromCarsList;
    }

    public List<WebElement> getAllValueFuelTypeFromCarsList() {
        return allValueFuelTypeFromCarsList;
    }

    public List<WebElement> getAllValueGearBoxFromCarsList() {
        return allValueGearBoxFromCarsList;
    }
}
