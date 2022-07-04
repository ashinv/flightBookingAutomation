package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingpage {
    private WebDriver driver;
    @FindBy(id = "booking_user_name")
    private WebElement Guestusername;
    @FindBy(id = "before_country_code")
    private WebElement countrycode;
    @FindBy(id = "booking_user_mobile")
    private WebElement phoneNumber;
    @FindBy(xpath = "//*[@id=\"continue_as_guest\"]")
    private WebElement book;
    public Bookingpage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void EnterUsername() {
        Guestusername.click();
        Guestusername.sendKeys("astronomic@gmail.com");
    }
    public void SelectCountrycode() {
        countrycode.click();
        WebElement dropdown = driver.findElement(By.id("before_country_code"));
        dropdown.findElement(By.xpath("//option[. = 'India +91']")).click();
    }

    public void EnterPhoneNumber() {
        phoneNumber.click();
        phoneNumber.sendKeys("9446334251");

    }

    public void Confirmbooking() {
        book.click();
    }
}
