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

    }
    public RadioButton(WebDriver driver, WebElement webElement) {
        this.uiElement = new UIElement(driver, webElement);
    }
    public RadioButton getRows(int index) {
        ArrayList<UIElement> list = (ArrayList<UIElement>) uiElement.findUIElements(By.cssSelector("input.radio"));
        return new RadioButton(driver, list.get(index));
    }
    public UIElement getRadioClick() {
        return uiElement.findElement(By.cssSelector("input.radio"));
    }

}
