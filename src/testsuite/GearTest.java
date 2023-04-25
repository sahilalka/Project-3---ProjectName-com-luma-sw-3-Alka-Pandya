package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class GearTest extends Utility {
    String baseUrl = " https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouse Hover on Gear Menu
        mouseHoverOnElement(By.xpath("//a[@role='menuitem']//span[contains(text(),'Gear')]"));

        // Click on Bags
        clickOnElement(By.xpath("//span[contains(text(),'Bags')]/.."));

        // Click on Product Name ‘Overnight Duffle’
        clickOnElement(By.xpath("//a[contains(text(),'Overnight Duffle')]/.."));

        //Verify the text ‘Overnight Duffle’
        String expectedMessage = "Overnight Duffle";
        String actualMessage = getTextFromElement(By.xpath("//span[contains(text(),'Overnight Duffle')]"));
        Assert.assertEquals("Text not matched", expectedMessage, actualMessage);

        // Change Qty 3
        clickOnElement(By.xpath("//input[@id='qty']"));
        clearText(By.xpath("//input[@id='qty']"));
        sendTextToTheElement(By.xpath("//input[@id='qty']"), "3");

        // Click on ‘Add to Cart’ Button.
        clickOnElement(By.xpath("//button[@class='action primary tocart']//span[contains(text(),'Add to Cart')]"));

        // Verify the text‘You added Overnight Duffle to your shopping cart.’
        String expectedMessage2 = "You added Overnight Duffle to your shopping cart.";
        String actualMessage2 = getTextFromElement(By.xpath("//div[@class='messages']//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        Assert.assertEquals("Error Message displayed", expectedMessage2, actualMessage2);

        // Click on ‘shopping cart’ Link into message
        clickOnElement(By.linkText("shopping cart"));

        // Verify the product name ‘Overnight Duffle’
        String expectedMessage3 = "Overnight Duffle";
        String actualMessage3 = getTextFromElement(By.linkText("Overnight Duffle"));
        Assert.assertEquals("Error Message displayed", expectedMessage3, actualMessage3);

        // Verify the Qty is ‘3’
        String actualQuantity = driver.findElement(By.xpath("//input[@class='input-text qty']")).getAttribute("value");
        String expectedQuantity = "3";
        Assert.assertEquals("Qty not matched", expectedQuantity, actualQuantity);

        // Change Qty to ‘5’
        clickOnElement(By.xpath("//input[@class='input-text qty']"));
        clearText(By.xpath("//input[@class='input-text qty']"));
        sendTextToTheElement(By.xpath("//input[@class='input-text qty']"), "5");

        //  Click on ‘Update Shopping Cart’ button
        clickOnElement(By.xpath("//span[contains(text(),'Update Shopping Cart')]"));

        // Verify the product price ‘$225.00’
        Thread.sleep(1000);
        Assert.assertEquals("Price not matched", "$225.00, By.xpath(//td[@class='col subtotal']//span[@class='cart-price']");

    }

    public void closeBrowser() {
        closeBrowser();
    }
}












































//
//
//
//








































