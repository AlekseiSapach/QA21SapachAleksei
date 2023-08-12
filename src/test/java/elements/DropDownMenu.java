package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDownMenu {
    private List<String> textList;
    private List<UIElement> uiElementList;

    public DropDownMenu(WebDriver driver, String attributeClassValue) {
        uiElementList = new ArrayList<>();
        textList = new ArrayList<>();

        for (WebElement webElement: driver.findElements(By.className(attributeClassValue))) {
            UIElement element = new UIElement(driver, webElement);
            uiElementList.add(element);
            textList.add(element.findUIElement(By.xpath("//*[starts-with(@id, 'defect_plugin_chzn_o_')]"))
                    .getText().trim());
        }
    }
    public void selectByTextDropDown(String text){
        uiElementList.get(textList.indexOf(text)+1).click();
    }
}
