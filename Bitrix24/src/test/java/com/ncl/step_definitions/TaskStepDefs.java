package com.ncl.step_definitions;


import com.ncl.pages.CruisesPage;
import com.ncl.pages.HomePage;
import com.ncl.pages.VacationsPage;
import com.ncl.utilities.ConfigurationReader;
import com.ncl.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class TaskStepDefs {

    HomePage homePage = new HomePage();
    VacationsPage vacationsPage = new VacationsPage();
    CruisesPage cruisesPage = new CruisesPage();

    String fromPrice;
    String insidePrice;

    public void checkForAd() {

        Boolean isPresent;

        isPresent = Driver.get().findElements(By.xpath("//*[@id=\"IPEinvL850\"]/map/area[1]")).size() > 0;
        if(isPresent) Driver.get().findElement(By.xpath("//*[@id=\"IPEinvL850\"]/map/area[1]")).click();

    }

    @Given("client is on the ncl home page")
    public void client_is_on_the_ncl_home_page() {
        System.out.println("Opening the ncl home page");
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("a client searches for “Alaska Cruises” on “April, 2021”")
    public void a_client_searches_for_alaska_cruises_on_april_2021() {

        System.out.println("Searching for Alaska cruises");

        homePage.destinationDropdown.click();
        checkForAd();
        Driver.get().manage().window().maximize();
        homePage.alaskaCruisesCheckbox.click();
        checkForAd();
        homePage.destinationApplyButton.click();
        checkForAd();
        homePage.datesDropdown.click();
        checkForAd();
        homePage.aprilCheckbox.click();
        checkForAd();
        homePage.datesApplyButton.click();
        checkForAd();
        homePage.findACruiseButton.click();
    }

    @Given("sees a “Price From” on the first displayed cruise")
    public void sees_a_Price_From_on_the_first_displayed_cruise() throws InterruptedException{
        System.out.println("Checking the fromPrice of cruises");
        Thread.sleep(2000);

        Boolean specialOfferExists = Driver.get().findElements(By.xpath("//*[@id=\"simplemodal-close-img\"]/i")).size() > 0;
        if (specialOfferExists) Driver.get().findElement(By.xpath("//*[@id=\"simplemodal-close-img\"]/i")).click();

        Thread.sleep(2000);

        fromPrice = vacationsPage.priceFrom.getText();

        System.out.println("Minimum price is " + fromPrice);

    }


    @When("the client selects “View Cruise”")
    public void the_client_selects_View_Cruise()  {
        System.out.println("Clicking 'View cruises' button");

        vacationsPage.viewCruiseButton.click();

    }

    @When("navigates to “Dates & Prices” section")
    public void navigates_to_Dates_Prices_section() {
        System.out.println("Clicking 'Dates and Prices tab'");

        cruisesPage.datesAndPricesTab.click();

    }

    @Then("at least one Category Meta price should match the advertised price")
    public void at_least_one_Category_Meta_cell_in_the_grid_price_should_match_the_advertised_price() throws InterruptedException {

        System.out.println("Comparing prices");

        Thread.sleep(2000);

        insidePrice = cruisesPage.insidePrice.getText();

        System.out.println("Inside price is " + insidePrice);

        Assert.assertEquals(fromPrice, insidePrice);

        System.out.println("Prices match");

    }
}
