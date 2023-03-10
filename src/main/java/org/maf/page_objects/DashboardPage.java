package org.maf.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    @FindBy(xpath = "//p[contains(@class,'ltr:font-inter-bold rtl:font-noto-sans-arabic-bold')]")
    private WebElement bookingRef;

    @FindBy(xpath ="//div[@class='circles not-active']")
    private WebElement addGuestCircleNotActive;

    @FindBy(xpath ="(//div[@class='circles active'])[2]")
    private WebElement addGuestCircleActive;

    @FindBy(xpath ="(//div[@class='circles active'])[3]")
    private WebElement chooseGearActive;

    @FindBy(xpath ="//div[@class=\"card-container\"][//p[contains(text(), \"Welcome back!\")]]")
    private WebElement welcomeBackBox;

    @FindBy(xpath ="//section[//h2[contains(., \"Popular passes\")]]")
    private WebElement PopularPassesBox;

    @FindBy(xpath ="(//*[@class=\"card-container\"][//h3[contains(text(), \"Snow Premium\")]]//div[@class=\"activity-card product-card\"])[1]")
    private WebElement snowPremiumCardFirstActivity;

    @FindBy(xpath ="(//*[@class=\"card-container\"][//h3[contains(text(), \"Snow Premium\")]]//div[@class=\"activity-card product-card\"])[2]")
    private WebElement snowPremiumCardSecondActivity;



    public DashboardPage (WebDriver driver) {
        PageFactory.initElements (driver,this);
    }

    public WebElement getBookingRef() {
        return bookingRef;
    }

    public void setBookingRef (WebElement bookingRef) {
        this.bookingRef = bookingRef;
    }
    public WebElement getAddGuestCircleNotActive() {
        return addGuestCircleNotActive;
    }

    public void setAddGuestCircleNotActive (WebElement addGuestCircleNotActive) {
        this.addGuestCircleNotActive = addGuestCircleNotActive;
    }

    public WebElement getAddGuestCircleActive() {
        return addGuestCircleActive;
    }

    public void setAddGuestCircleActive(WebElement addGuestCircleActive) {
        this.addGuestCircleActive = addGuestCircleActive;
    }

    public WebElement getChooseGearActive() {
        return chooseGearActive;
    }

    public void setChooseGearActive(WebElement chooseGearActive) {
        this.chooseGearActive = chooseGearActive;
    }

    public WebElement getWelcomeBackBox() {
        return welcomeBackBox;
    }

    public void setWelcomeBackBox(WebElement welcomeBackBox) {
        this.welcomeBackBox = welcomeBackBox;
    }

    public WebElement getPopularPassesBox() {
        return PopularPassesBox;
    }

    public void setPopularPassesBox(WebElement popularPassesBox) {
        PopularPassesBox = popularPassesBox;
    }

    public WebElement getSnowPremiumCardFirstActivity() {
        return snowPremiumCardFirstActivity;
    }

    public void setSnowPremiumCardFirstActivity(WebElement snowPremiumCardFirstActivity) {
        this.snowPremiumCardFirstActivity = snowPremiumCardFirstActivity;
    }

    public WebElement getSnowPremiumCardSecondActivity() {
        return snowPremiumCardSecondActivity;
    }

    public void setSnowPremiumCardSecondActivity(WebElement snowPremiumCardSecondActivity) {
        this.snowPremiumCardSecondActivity = snowPremiumCardSecondActivity;
    }
}
