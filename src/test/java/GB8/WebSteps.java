package GB8;

import com.codeborne.selenide.Selenide;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class WebSteps {
    public void open() {
        Selenide.open("http://duckduckgo.com/");
    }

    //searchbox_searchbox__eaWKL
    public void search() {
       $(".searchbox_searchbox__eaWKL").click();
       $(".searchbox_searchbox__eaWKL").setValue("book");
       $(".searchbox_searchButton").click();
       $(".search__input").shouldHave(text("book"));

    }

}
