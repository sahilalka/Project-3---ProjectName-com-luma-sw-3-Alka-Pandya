package testsuite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class WomenTest extends Utility {
    String baseUrl =  " https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyTheSortByProductNameFilter() {
        //Mouse Hover on Women Menu
        mouseHoverOnElement(By.xpath("//a[@class='level-top ui-corner-all'][@id='ui-id-4']"));

        //Mouse Hover on Tops
        mouseHoverOnElement(By.xpath("//a[@id='ui-id-9']"));

        //Click on Jackets
        clickOnMouseHoverOnElement(By.cssSelector("a[id='ui-id-11'] span"));
        // Select Sort By filter “Product Name”
        dropDownOption(By.id("sorter"), "name");

        // Verify the products name display in alphabetical order
        List<WebElement> nameOfProduct = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]"));
        AbstractList<String> actualProductList = new ArrayList<>();
        for (WebElement element : nameOfProduct) {
            actualProductList.add(element.getText());
            System.out.println(actualProductList);
        }
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        //Mouse Hover on Women Menu
        mouseHoverOnElement(By.xpath("//a[@class='level-top ui-corner-all'][@id='ui-id-4']"));

        //Mouse Hover on Tops
        mouseHoverOnElement(By.xpath("//a[@id='ui-id-9']"));

        //Click on Jackets
        clickOnMouseHoverOnElement(By.cssSelector("a[id='ui-id-11'] span"));

        // Select Sort By filter “Price”
        dropDownOption(By.id("sorter"), "name");

        // Verify the products price display in Low to High
        List<WebElement> priceOfProduct = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]"));
        AbstractList<String> actualProductList = new ArrayList<>();
        for (WebElement element : priceOfProduct) {
            actualProductList.add(element.getText());
            System.out.println(actualProductList);
        }
    }
      public void closeBrowser(){
        driver.close();
      }


}












        















