package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownMenu {
    private UIElement uiElement;

    public DropDownMenu(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public DropDownMenu(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }
}
