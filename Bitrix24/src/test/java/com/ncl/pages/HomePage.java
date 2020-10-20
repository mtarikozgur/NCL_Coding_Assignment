package com.ncl.pages;

import com.ncl.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "/html/body/main/section[1]/div/div/form/div[2]/div/div[1]/div/div/div[1]/div/div[1]/div/div[1]/div")
    public WebElement destinationDropdown;

    @FindBy(css = "label[for='c80_checkboxALASKA']")
    public WebElement alaskaCruisesCheckbox;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/form/div[2]/div/div[1]/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[3]/div/div/div[2]/ul/li[2]/a")
    public WebElement destinationApplyButton;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/form/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[1]/div")
    public WebElement datesDropdown;

    @FindBy (css = "label[for='c27_checkbox320213']")
    public WebElement aprilCheckbox;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/form/div[2]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/ul/li[2]/a")
    public WebElement datesApplyButton;

    @FindBy(xpath = "/html/body/main/section[1]/div/div/form/div[2]/div/div[3]")
    public WebElement findACruiseButton;

}