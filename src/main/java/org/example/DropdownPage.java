package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    private WebDriver driver;
    private By dropdownLocator = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFromDropdown(String option) {
        getDropdown().selectByVisibleText(option);
    }
    public List<String> getSelectedOption() {
        List<WebElement> selectedElement = getDropdown().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for (WebElement element : selectedElement) {
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }



    public Select getDropdown() {
        return new Select(driver.findElement(dropdownLocator));
    }
}
