package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton {
    private UIElement uiElement;
    private WebDriver driver;
    private List<String> rows;

    public RadioButton(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.rows = new ArrayList<>();

        for (UIElement element : uiElement.findUIElements(By.cssSelector("div.radio"))) {
            rows.add(element.getText());
        }
    }
    public RadioButton(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }


}
