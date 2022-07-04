package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModificationPage {
    private WebDriver driver;
    @FindBy(xpath ="//*[@id=\"stopCountWrapper\"]/a[2]/input")
    private WebElement stop;
    @FindBy(xpath ="//*[@id=\"departureTimeWrapper\"]/a[2]/div/div[1]/input")
    private WebElement morning;
    @FindBy(xpath="//*[@id=\"t-w-i-1\"]/div[1]/div[1]/div[2]/div/div[1]/div/div[1]/span")
    public WebElement searchPrice;
    @FindBy(xpath="//*[@id=\"iti_det_10\"]/div/div/div[2]/div/div/div[3]/div[2]/span")
    public WebElement detailPrice;
    @FindBy(xpath="//*[@id=\"form-id-15\"]/button")
    public  WebElement bookNow;

    public ModificationPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void NumberOfStops() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element= wait.until(ExpectedConditions.visibilityOf(bookNow));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        stop.click();
    }
    public void MorningFlight() {
        morning.click();
    }
    public void BookFlight() {
        bookNow.click();
    }

}
