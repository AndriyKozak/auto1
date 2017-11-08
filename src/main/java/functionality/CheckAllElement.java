package functionality;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CheckAllElement {

    private static final String BMW = "BMW";

    public void checkSize(List<WebElement> list) {
        if (list.size() != 20) {
            System.out.println("Fail, wrong number of elements found");
        }
    }

    public void checkAllElements(List<WebElement> list) {

        for (int i = 0; i < list.size(); i++) {
            String optionValue = list.get(i).getText();
            if (optionValue == null) {
                System.out.println("Failed on: " + optionValue);
            } else {
                System.out.println("Passed on: " + optionValue);
            }
        }
    }

    protected void checkAllElementsContains(List<WebElement> list) {

        for (int i = 0; i < list.size(); i++) {
            String optionValue = list.get(i).getText();
            Assert.assertTrue(optionValue.contains(BMW));
            if (optionValue.contains(BMW)) {
                System.out.println("passed on: " + optionValue);
            } else {
                System.out.println("failed on: " + optionValue);
            }
        }
    }
}
