package com.ncl.pages;

import com.ncl.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CruisesPage {

    public CruisesPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"anchors-nav\"]/div/div/div/div/div[1]/div[1]/ul/li[2]/a")
    public WebElement datesAndPricesTab;

    @FindBy(xpath = "//*[@id=\"anchor-datePrice\"]/div/div/div/div/div[2]/ul/li/div/div[1]/div/div[2]/div/div[2]/ul/li/div/div[2]/div/ul/li[2]/div/div[2]/div/div[2]/div/div[1]/div/div/div/div[1]/span")
    public WebElement insidePrice;

}
