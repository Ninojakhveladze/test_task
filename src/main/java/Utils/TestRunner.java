package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class TestRunner {

    @BeforeTest
    public static void options() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "";
        Configuration.startMaximized = true;
        Configuration.timeout = 2000;

    }
    public static void firstTest() throws InterruptedException {
        Selenide.open("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
    }

    public static void secondTest() throws InterruptedException {
        Selenide.open("https://www.way2automation.com/way2auto_jquery/alert.php#load_box");
    }

    public static void thirdTest() throws InterruptedException {
        Selenide.open("https://dineshvelhal.github.io/testautomation-playground/forms.html");
    }
}
