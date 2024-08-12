import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;


public class MyStepdefs {
    
    @Given("I open duckduckgo")
    public void iOpenDuckduckgo() {
        Selenide.open("http://duckduckgo.com/");
    }


    @When("I input in search line text")
    public void iInputInSearchLineText() {
        $("#searchbox_input").click();
        //$("#searchbox_input").setValue("book").pressEnter();
    }
    @And("click search {string}")
    public void clickSearchText(String text) {
        $("#searchbox_input").setValue(String.valueOf(text)).pressEnter();
    }
//    @And("click search")
//    public void clickSearch() {
//        $("#searchbox_input").setValue("book").pressEnter();
//    }

    @Then("I see text {string}")
    public void iSeeTextText(String text) {
    $("#search_form_input").shouldHave();
    }



//    @Then("I see text {string}")
//    public void iSeeText(String arg0) {$("#search_form_input").shouldHave(value("book"));
//    }
//


//    @Then("I see text {string}")
//    public void iSeeText() {
//        $("#search_form_input").shouldHave(text("book"));
//    }
}
