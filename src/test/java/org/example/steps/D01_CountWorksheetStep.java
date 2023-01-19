
package org.example.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.P01_HomePage;

public class D01_CountWorksheetStep {
    HomePage CountWorkSheet = new HomePage();

    @When("open Nagwa website")
    public void goWebsite() throws InterruptedException {
        String Url = "https://www.nagwa.com";
        Hooks.driver.navigate().to(Url);
        Thread.sleep(1000L);
    }

    @And("Choose a language to open the home page")
    public void select_En_language() {
        this.CountWorkSheet.lang_btn().click();
        this.CountWorkSheet.select_lang().click();
    }

    @And("user click on search field")
    public void user_click_on_search_field() {
        this.CountWorkSheet.search_Btn().click();
    }

    @And("user enter \"(.*)\" to search$")
    public void user_enter_search_value(String searchName) {
        this.CountWorkSheet.search_Box().sendKeys(searchName);
        this.CountWorkSheet.search_submit().click();
    }

    @And("Click on search icon to start searching on lessons")
    public void Click_on_search_icon() {
        this.CountWorkSheet.search_Btn().click();
    }

    @Then("Click on 2nd lesson")
    public void Click_on_2nd_lesson() {
        this.CountWorkSheet.getSecondResult().click();
    }

    @And("Go to worksheet section then click preview button")
    public void Go_to_worksheet_section() {
        this.CountWorkSheet.worksheet_sec().click();
    }

    @Then("Count number of questions displayed and print the count")
    public void Click_preview_button() {
        this.CountWorkSheet.count_of_questions();
    }
}
