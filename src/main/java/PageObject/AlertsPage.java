package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AlertsPage {
    protected SelenideElement
        simpleAlertButton = $(byXpath("//button[contains(text(), 'Click the button to display')]"));

    public void clickSimpleAlertButton() {
        Selenide.switchTo().frame(0);
        simpleAlertButton.click();
    }

    public String getAlertText() {
        return Selenide.switchTo().alert().getText();
    }

    public void acceptAlert() {
        Selenide.switchTo().alert().accept();
    }
}
