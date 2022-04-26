package StepDefinitions;

import PageObject.AlertsPage;
import Utils.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.AlertData.*;

public class AlertTest extends TestRunner {

    @Test
    public static void CheckSimpleAlert() throws InterruptedException {
        secondTest();
        AlertsPage alertsPage = new AlertsPage();

        alertsPage.clickSimpleAlertButton();
        Assert.assertEquals(alertText, alertsPage.getAlertText());
        alertsPage.acceptAlert();
    }
}
