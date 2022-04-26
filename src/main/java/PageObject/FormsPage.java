package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    protected SelenideElement
        seleniumRadio = $("#rad_selenium"),
        selectedSelenium = $("#rad_validate"),
        dropdown = $("#select_tool"),
        selectedOption = $("#select_tool_validate");

    public void selectSelenium() {
        seleniumRadio.selectRadio("SELENIUM");
    }

    public boolean isSeleniumSelected() {
        return selectedSelenium.isDisplayed();
    }

    public String getSelectedSeleniumText() {
        return selectedSelenium.getText();
    }

    public void selectOption() {
        dropdown.selectOption(1);
    }

    public boolean isProtractorSelected() {
        return selectedOption.isDisplayed();
    }

    public String getSelectedOptionText() {
        return selectedOption.getText();
    }
}
