package pages;

import driver.driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPage {

    public driver Driver = null;
    public WebDriver driver = null;

    @FindBy(xpath="//*[@id='twotabsearchtextbox']")
    WebElement inputSearchTxt;
    @FindBy(xpath="//*[@id='nav-search-submit-text']/input")
    WebElement searchBtn;

    public amazonPage(driver driver) {

        this.Driver = driver;
        PageFactory.initElements(this.Driver.returnDriver(), this);
    }

public void search(String value)
{
    inputSearchTxt.sendKeys(value);
    searchBtn.click();
}
}
