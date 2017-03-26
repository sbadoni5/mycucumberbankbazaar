package com.myapp.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    // The element is now looked up using the name attribute
    @FindBy(name = "q")
    private WebElement searchBox;

    public void searchFor(String text) {
        // We continue using the element just as before
        searchBox.sendKeys(text);
        searchBox.submit();
        System.out.println(text);
    }
} 