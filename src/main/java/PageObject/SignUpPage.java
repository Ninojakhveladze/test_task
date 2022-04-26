package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SignUpPage {
    protected SelenideElement
        nameInput = $(byAttribute("name", "name"));

    public boolean nameInputIsDisplayed() {
        return nameInput.isDisplayed();
    }

    public void fillNameInput(String name) {
        nameInput.sendKeys(name);
    }

    public SelenideElement nameInputIsFilled() {
        return nameInput.shouldNotBe(Condition.empty);
    }

    public void clearNameInput() {
        nameInput.clear();
    }

    public SelenideElement nameInputIsEmpty() {
        return nameInput.shouldBe(Condition.empty);
    }
}
