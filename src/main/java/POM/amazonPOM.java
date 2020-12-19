package POM;

import driver.driver;
import pages.amazonPage;
import pages.elementPage;
import pages.srlPage;

public class amazonPOM {
    public String price;
    driver Driver =null;
    amazonPage amazonP=null;
    public amazonPOM(driver Driver) 
    {
   this.Driver = Driver;
   this.amazonP = new amazonPage(this.Driver);
    }
    
    public void goToAmazon() throws InterruptedException {
        Driver.goto_url("https://www.amazon.com/-/es/ref=nav_logo");
        Driver.implicitwait();
    }
    
    public void searchFor(String value)
    {
    amazonP.search(value);
    }

public void verificarZapatillas() throws InterruptedException {
    goToAmazon();
    Driver.implicitwait();
    searchFor("zapatillas");
    srlPage resultpage = new srlPage(this.Driver);
    resultpage.enterElement();
    elementPage ePage = new elementPage(this.Driver);
    ePage.getPrice();

}



}
