package StepDefinitions;

import PageObject.AlertsPage;
import PageObject.FormsPage;
import Utils.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.FormsData.*;

public class FormTest extends TestRunner {

    @Test
    public static void CheckSimpleAlert() throws InterruptedException {
        thirdTest();
        FormsPage formsPage = new FormsPage();

        formsPage.selectSelenium();
        Assert.assertTrue(formsPage.isSeleniumSelected());
        Assert.assertEquals(selenium, formsPage.getSelectedSeleniumText());
        formsPage.selectOption();
        Assert.assertTrue(formsPage.isProtractorSelected());
        Assert.assertEquals(selectedOption ,formsPage.getSelectedOptionText());
    }
}
