package test;

import POM.amazonPOM;
import driver.driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class demoTest {

    driver Driver = null;
    WebElement we = null;

    @BeforeClass
    public void setupEnv() {
        Driver = new driver();
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Starting Demo Testing Amazon");
    }

    @Test(priority = 0)
    public void elementsPresent() throws InterruptedException {
       amazonPOM apom =  new amazonPOM(Driver);
       apom.verificarZapatillas();
       Assert.assertEquals(apom.price, carritoCompras.price );

    }



    @AfterClass
    public void teardown()
    {
        Driver.teardown();
    }
}