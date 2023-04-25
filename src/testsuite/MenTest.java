package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MenTest extends Utility {

    String baserUrl = " https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baserUrl);
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        // Mouse Hover on Men Menu
        mouseHoverOnElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[2]"));

        //Mouse Hover on Bottoms
        mouseHoverOnElement(By.xpath("//a[@id='ui-id-18']"));

        // Click on pants
        clickOnElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        mouseHoverOnElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        clickOnElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));

        // Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        clickOnElement(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]"));

        // Verify the text
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
        System.out.println(actualMessage);
        Assert.assertEquals("Error Message displayed", expectedMessage, actualMessage);

        // Click on 'shopping cart 'Link into message
        clickOnElement(By.xpath("//button[@id='product-addtocart-button']"));

        // Verify the text ‘Shopping Cart.’
        String expectedMessage1 = "Shopping Cart";
        String actualMessage1 = getTextFromElement(By.cssSelector("div[data-bind='html: $parent.prepareMessageForHtml(message.text)'] a"));
        Assert.assertEquals("Error Message displayed", expectedMessage1, actualMessage1);

        // Verify the product name ‘Cronus Yoga Pant’
        String expectedMessage2 = "Cronus Yoga Pant";
        String actualMessage2 = getTextFromElement(By.xpath("//span[@class='base']"));
        Assert.assertEquals("Error Message displayed", expectedMessage2, actualMessage2);

        // Verify the product size ‘32’
        String expectedMessage3 = "size 32";
        String actualMessage3 = getTextFromElement(By.cssSelector("#option-label-size-143-item-175"));
        Assert.assertEquals("Error Message displayed", expectedMessage3, actualMessage3);

        // Verify the product colour ‘Black’
        String expectedMessage4 = "colour Black";
        String actualMessage4 = getTextFromElement(By.cssSelector("#option-label-color-93-item-49"));
        Assert.assertEquals("Error Message displayed", expectedMessage4, actualMessage4);


    }
  public void closeBrowser(){  // to close browser
        driver.close();
  }



}



















































