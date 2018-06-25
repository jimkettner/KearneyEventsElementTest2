package Base;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Base.WebDriverBasePage.getDriverInstance;


public class BasePage {

    NavigationPage navigation = new NavigationPage();

    @Given("^I have navigated to the \"([^\"]*)\" url$")
    public void memberNavigationPage(String pageName) {
        navigateToPageByURL(pageName);
    }

    private void navigateToPageByURL(String pageName) {
        String url = navigation.getUrl(pageName);
        getDriverInstance().navigate().to(url);
    }

    public boolean hasElementDisplayed(By by) {
        return getDriverInstance().findElement(by).isDisplayed();
    }

    public WebElement waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriverInstance(), 10);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void clickButton(WebElement element){
        try{
            element.click();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
