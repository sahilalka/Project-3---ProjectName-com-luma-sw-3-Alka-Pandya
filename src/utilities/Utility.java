package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {

    public void dropDownOption(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(text);
    }

    public void clickOnElement(By by) {
        driver.findElement(by).click();

    }

    public void clickOnMouseHoverOnElement(By by) {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(by);
        actions.moveToElement(driver.findElement(by)).click().build().perform();


    }

    public void mouseHoverOnElement(By by) {
        Actions actions = new Actions(driver);
        WebElement title = driver.findElement(by);
        actions.moveToElement(title).build().perform();

    }

    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }

    public void clearText(By by) {
        driver.findElement(by).click();

    }
   public void sendTextToTheElement(By by,String text){
       driver.findElement(by).getText();



   }



    }






