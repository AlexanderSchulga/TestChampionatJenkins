package steps;

import com.codeborne.selenide.Selenide;
import constants.ChampionatUrls;
import io.cucumber.java.en.Given;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseSteps {

    //пример хранения и передачи параметров в feature вместо стринг. инта и т.д.
    //public static Map<String, Object> container = new HashMap<>();
    //Но, обычно это делается через DI
    @Given("Open the page {string}")
    public void openPage(String url) {
        Selenide.open(ChampionatUrls.BASE_URL.getBaseUrl());

    }


}
