package com.ncl.pages;

import com.ncl.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VacationsPage {
    public VacationsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "/html/body/main/ul/li[2]/section/div/div/div[3]/ul/li[1]/article/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div/div/div/div/div[2]/div[1]/span")
    public WebElement priceFrom;

  //  @FindBy (xpath = "//*[@id=\"simplemodal-close-img\"]/i")
  //  public WebElement specialOffersXButton;

    @FindBy (xpath = "/html/body/main/ul/li[2]/section/div/div/div[3]/ul/li[1]/article/div[1]/div[3]/div/div[4]/div/div[1]/a")
    public WebElement viewCruiseButton;

}
