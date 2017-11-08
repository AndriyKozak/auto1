import functionality.Auto1Functionality;
import org.testng.annotations.Test;
import testng.AbstractTestCase;

public class CheckBMWCarsTest extends AbstractTestCase {

    private Auto1Functionality auto1Functionality;

    @Test(alwaysRun = true)
    public void verifyFilterWasSelected() {
        auto1Functionality = new Auto1Functionality();
        auto1Functionality.openOurCarsPage();
        auto1Functionality.selectFilterBMW();
        auto1Functionality.verifyFilterWasSelected();
    }

    @Test(alwaysRun = true, dependsOnMethods = "verifyFilterWasSelected")
    public void verifyAllCarsAreBMWOnPage() {
        auto1Functionality.verifyAllSelectedCarsBMW();
    }

    @Test(alwaysRun = true, dependsOnMethods = "verifyAllCarsAreBMWOnPage")
    public void verifyEachCarHasPicture() {
        auto1Functionality.verifyAllImgOfCars();
    }

    //Mileage, Registration
    @Test(alwaysRun = true, dependsOnMethods = "verifyEachCarHasPicture")
    public void verifyEachCarHasCompleteInformation() {
        auto1Functionality.verifyAllStockNumbersOfCars();
        auto1Functionality.verifyAllOdometerValuesOfCars();
        auto1Functionality.verifyAllFirstRegistration();
        auto1Functionality.verifyAllHorsepower();
        auto1Functionality.verifyAllBodyType();
        auto1Functionality.verifyAllFuelType();
        auto1Functionality.verifyAllGearBox();
    }
}
