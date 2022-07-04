package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.Bookingpage;
import pages.Homepage;
import pages.ModificationPage;

public class StepDefinitions {
    WebDriver driver;
    Homepage home;
    ModificationPage page;
    Bookingpage book;
    @Given("user is on homepage")
    public void user_is_on_homepage(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximised");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(chromeOptions);
        driver.get(Homepage.URL);
        page=new ModificationPage(driver);
        home=new Homepage(driver);
        book=new Bookingpage(driver);
    }

    @When("setting details in homepage")
    public void setting_details_in_homepage(){

        home.fromdestination();
        home.todestination();
        home.pickdate();
        home.additionaldetails();
        home.submit();
    }

    @And("setting details in modification page")
    public void setting_details_in_modification_page(){

        page.NumberOfStops();
        page.MorningFlight();
        if(page.searchPrice==page.detailPrice)
        {
            System.out.println("prices are same");
        }
        else {
            System.out.println("prices are not same");
        }
        page.BookFlight();
    }

    @And("entering guest details")
    public void entering_guest_details(){
        book.EnterUsername();
        book.SelectCountrycode();
        book.EnterPhoneNumber();
    }

    @Then("Book as guest")
    public void Book_as_guest(){
        book.Confirmbooking();
        driver.close();
    }

}
