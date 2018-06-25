package Pages;

import Base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ContactPage extends BasePage {

    @FindBy(css = "#href=\"http://www.kearneyevents.net/contact\">Contact</a>")
    private WebElement ContactPage;
    private WebElement driver;

    public boolean isOnContactPage() {
        return hasElementDisplayed(By.cssSelector(".field"));
    }

    public void clickOnContactPageLink() {
        clickButton(ContactPage);
    }

    @FindBy(css = "button")
    private WebElement SubmitButton;

    public void clickOnSubmitButton() {
        clickButton(SubmitButton);
    }
    public String getContactColor() {
        return String.valueOf(this.driver.findElement(By.cssSelector(".txt")));
    }
    final String actualColor = "rgba(255,0,0)";

    public WebElement getNameFirstISRequiredColor() {
        return this.driver.findElement(By.id("val val_msg"));
    }

    public WebElement clickOnTheContactPagelink() {
        return this.driver.findElement(By.cssSelector(".txt"));
    }

    public WebElement clickOnTheSubmitButton() {
        return this.driver.findElement(By.cssSelector(".Submit"));
    }

    public WebElement NameFirstIsRequiredIsRed() {
        return this.driver.findElement(By.cssSelector(".dnn_ctr556_Form_valctrlDigNameFirst"));
    }
}

