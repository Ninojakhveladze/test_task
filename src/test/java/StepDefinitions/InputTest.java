package StepDefinitions;

import PageObject.SignUpPage;
import Utils.TestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SignUpData.*;

public class InputTest extends TestRunner {

    @Test
    public static void CheckNameInputField() throws InterruptedException {
        firstTest();
        SignUpPage signUpPage = new SignUpPage();

        Assert.assertTrue(signUpPage.nameInputIsDisplayed());
        signUpPage.fillNameInput(name);
        signUpPage.nameInputIsFilled();
        signUpPage.clearNameInput();
        signUpPage.nameInputIsEmpty();
    }
}
