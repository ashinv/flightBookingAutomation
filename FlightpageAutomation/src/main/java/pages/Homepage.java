package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Homepage {
    private WebDriver driver;
    public static String URL = "https://demo.travelomatix.com/index.php";
    @FindBy(id = "from")
    private WebElement from;
    @FindBy(linkText = "Paris (CDG)")
    private WebElement fromlocation;
    @FindBy(id = "to")
    private WebElement to;
    @FindBy(linkText = "Barcelona (BCN)")
    private WebElement tolocation;
    @FindBy(id = "flight_datepicker1")
    private WebElement datepicker;
    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")
    private WebElement navright;
    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[5]/a")
    private WebElement sept1;
    @FindBy(css = ".totlall > .remngwd:nth-child(1)")
    private WebElement details;
    @FindBy(id="choosen_airline_class")
    private WebElement chooseclass;
    @FindBy(linkText="Business")
    private WebElement Business;
    @FindBy(css=".adult_count_div .glyphicon-plus")
    private WebElement addpassenger;
    @FindBy(id = "flight-form-submit")
    private WebElement submit;

    public Homepage(WebDriver driver) {
        this.driver=driver;
        driver.get(URL);
        PageFactory.initElements(driver,this);
    }
    public void fromdestination() {
        from.click();
        from.sendKeys("cdg");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        fromlocation.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void todestination() {
        to.click();
        to.sendKeys("bcn");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        tolocation.click();

    }
    public void pickdate() {
        datepicker.click();
        navright.click();
        sept1.click();

    }
    public void additionaldetails() {
        details.click();
        chooseclass.click();
        Business.click();
        addpassenger.click();

    }
    public void submit() {
        submit.click();
    }
}
