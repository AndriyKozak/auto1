package functionality;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObject.OurCarsPage;
import utils.driver.DriverFactory;

import java.util.List;

public class Auto1Functionality {

    private OurCarsPage ourCarsPage;
    private CheckAllElement checkAllElement;

    public void openOurCarsPage() {
        ourCarsPage = new OurCarsPage(DriverFactory.getDriver());
        ourCarsPage.openOurCarsPage();
    }

    public void selectFilterBMW() {
        ourCarsPage.selectFilterBMW();
    }

    public void verifyFilterWasSelected() {
        System.out.println("1. BMW checkbox was selected");
        String selectedManufacturesInSelect = ourCarsPage.getSelectedManufacturesInSelect();
        Assert.assertTrue(selectedManufacturesInSelect.contains("BMW"));
    }

    public void verifyAllSelectedCarsBMW() {
        System.out.println("2. All cars are BMW’s on the page");
        checkAllElement = new CheckAllElement();
        List<WebElement> carNameList = ourCarsPage.getCarNameList();
        checkAllElement.checkAllElementsContains(carNameList);
    }

    public void verifyAllImgOfCars() {
        System.out.println("3. Each car has picture");
        ourCarsPage.checkAllImagesOfCars();
    }

    public void verifyAllStockNumbersOfCars() {
        System.out.println("4. Each Stock Number of car is not empty");
        List<WebElement> listStockNum = ourCarsPage.getAllValueStockNumberFromCarsList();
        checkAllElement.checkSize(listStockNum);
        checkAllElement.checkAllElements(listStockNum);
    }

    public void verifyAllOdometerValuesOfCars() {
        System.out.println("5. Each Odometer Number of car is not empty");
        List<WebElement> listOdometerValues = ourCarsPage.getAllValueMileageFromCarsList();
        checkAllElement.checkSize(listOdometerValues);
        checkAllElement.checkAllElements(listOdometerValues);
    }

    public void verifyAllFirstRegistration() {
        System.out.println("6. Each First Registration of car is not empty");
        List<WebElement> listFirstRegistrationValues = ourCarsPage.getAllValueRegistrationFromCarsList();
        checkAllElement.checkSize(listFirstRegistrationValues);
        checkAllElement.checkAllElements(listFirstRegistrationValues);
    }

    public void verifyAllHorsepower() {
        System.out.println("7. Each Horsepower of car is not empty");
        List<WebElement> listHorsepowerValues = ourCarsPage.getAllValueHorsepowerFromCarsList();
        checkAllElement.checkSize(listHorsepowerValues);
        checkAllElement.checkAllElements(listHorsepowerValues);
    }

    public void verifyAllBodyType() {
        System.out.println("8. Each Body Type of car is not empty");
        List<WebElement> listBodyTypeValues = ourCarsPage.getAllValueBodyTypeFromCarsList();
        checkAllElement.checkSize(listBodyTypeValues);
        checkAllElement.checkAllElements(listBodyTypeValues);
    }

    public void verifyAllFuelType() {
        System.out.println("9. Each Fuel Type of car is not empty");
        List<WebElement> listFuelTypeValues = ourCarsPage.getAllValueFuelTypeFromCarsList();
        checkAllElement.checkSize(listFuelTypeValues);
        checkAllElement.checkAllElements(listFuelTypeValues);
    }

    public void verifyAllGearBox() {
        System.out.println("10. Each Gear Box of car is not empty");
        List<WebElement> listGearBoxValues = ourCarsPage.getAllValueGearBoxFromCarsList();
        checkAllElement.checkSize(listGearBoxValues);
        checkAllElement.checkAllElements(listGearBoxValues);
    }
}
