package tests.web_tests;

import org.maf.core.instance.BetaDriver.base;
import org.maf.page_objects.*;
import org.maf.utils.Common_steps.SharedSteps;
import org.maf.utils.ExtentReport.TestListener;
import org.maf.utils.common.SharedMethods;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class PaymentDetailsTests extends base {


    @Test(description = "Validate that the user can fill payment details info and submit payment using Mastercard")
    public void ValidateThatUserCanFillPaymentDetailsInfo() {

        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("masterCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
    }


    @Test(description = "Verify that the user is able to pay using visa payment")
    public void ValidatePaymentWithVisaCard(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("visaCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());


    }

    @Test(description = "Verify that the user is able to pay using 3d visa card")
    public void ValidatePaymentWith3dVisaCard(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName1"),  objXMLReader.getXMLData ("passWord1"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementClickable (addOnsScreen.getGuestsDropDownList ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("visaCard3d"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());


    }

    @Test(description = "Verify that the user is able to pay using 3d master card")
    public void ValidatePaymentWith3dMasterCard(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName1"),  objXMLReader.getXMLData ("passWord1"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementClickable (addOnsScreen.getGuestsDropDownList ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("masterCard3d"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());


    }

    @Test(description = "Verify that the user is not able to pay using Amex payment")
    public void ValidatePaymentWithAmex(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName1"),  objXMLReader.getXMLData ("passWord1"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementClickable (addOnsScreen.getGuestsDropDownList ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
       SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("amexCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        PaymentFailedPage paymentFailedPage= new PaymentFailedPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentFailedPage.getBackToPaymentButton());
        Assert.assertTrue (paymentFailedPage.getBackToPaymentButton().isDisplayed ());


    }
    @Test(description = "Verify that the user is able to pay using promo code (full)")
    public void ValidatePaymentWithPromoCode(){
        SKiHomePage sKiHomePage = new SKiHomePage(getDriver ());
        sKiHomePage.getAcceptCookiesButton ().click ();
        SharedSteps.userLogInToTheSite( objXMLReader.getXMLData ("userName1"),  objXMLReader.getXMLData ("passWord1"));
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementClickable (addOnsScreen.getGuestsDropDownList ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        SharedSteps.userApplyPromoCode(objXMLReader.getXMLData ("snowParkFullPromoCode"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());

    }
    @Test(description = "Verify that the user is able to pay using promo code (partial)")
    public void ValidatePaymentWithPromoCodeVisa(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        SharedMethods.clickAction(paymentDetailsPage.getPromoCodeRadio());
        paymentDetailsPage.getPromoCodeField ().sendKeys (objXMLReader.getXMLData ("snowParkPartialPromoCode"));
        paymentDetailsPage.getApplyPromoCode().click();
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("visaCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
    }
    @Test(description = "Verify that the user is able to pay using share (Partial)")
    public void ValidatePaymentWithShareVisa(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getRedeemButton().click();
        paymentDetailsPage.getRedeemAmount().sendKeys ("1");
        paymentDetailsPage.getApplyRedeemPoints().click();
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("visaCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
    }

    @Test(description = "Verify that the user is able to pay using share (full)")
    public void ValidatePaymentWithShare(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getRedeemButton().click();
        paymentDetailsPage.getUseAllMyShareToggle().click();
        paymentDetailsPage.getApplyRedeemPoints().click();
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
    }
    @Test(description = "Verify that the user is able to add a card from the payment screen")
    public void ValidateSaveCc(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        SignUpTest signUpTest=new SignUpTest();
        signUpTest.validateThatUserIsAbleToSignUp();
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getSlopeOption ());
        sKiHomePage.getSlopeOption ().click ();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver ());
        SharedMethods.threadSleep (2000);
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSlopePassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getFullDaySlopePassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getFullDaySlopePassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.threadSleep (1000);
        SharedMethods.waitUntilElementClickable (addOnsScreen.getGuestsDropDownList ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        SharedMethods.mouseClickAction (addOnsScreen.getNumberOfJuniors ());
        SharedMethods.mouseClickAction (addOnsScreen.getRemoveAdultGuest ());
        SharedMethods.clickOn(addOnsScreen.getGuestsDropDownList ());
        Assert.assertTrue (addOnsScreen.getSupervisionAddOnsTicket().isDisplayed ());
        Assert.assertTrue (addOnsScreen.getNeedSupervisionTicketMsg().isDisplayed ());
        SharedMethods.clickOn(addOnsScreen.getSupervisionTicketPlusButton ());
        Assert.assertTrue (addOnsScreen.getAddedSupervisionToBookingCard().isDisplayed ());
        SharedMethods.waitTillClickAble (addOnsScreen.getContinueButton());
        addOnsScreen.getContinueButton ().click ();
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        Assert.assertTrue (personalDetailsPage.getContinueToPayment ().isDisplayed ());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getCcField().sendKeys(objXMLReader.getXMLData ("visaCard1"));
        paymentDetailsPage.getCardExpiry().sendKeys(objXMLReader.getXMLData ("cardExp"));
        paymentDetailsPage.getCardCSV().sendKeys(objXMLReader.getXMLData ("cardCSV"));
        paymentDetailsPage.getSaveCCDetailsCheckbox().click();
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getUserAvatar());
        SharedMethods.clickAction(sKiHomePage.getUserAvatar());
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPaymentOption());
        sKiHomePage.getPaymentOption().click();
        PaymentMethodsPage paymentMethodsPage= new PaymentMethodsPage(getDriver());
        SharedMethods.threadSleep (3000);
        Assert.assertEquals (paymentMethodsPage.getCardExpiryField(),objXMLReader.getXMLData ("cardCSV"));
        //

    }
    @Test(description = "Verify that the website handle the failed payments (2.55)")
    public void ValidaFailedPayment255(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getRedeemButton().click();
        paymentDetailsPage.getRedeemAmount().sendKeys ("172.45");
        paymentDetailsPage.getApplyRedeemPoints().click();
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("visaCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
    }
    @Test(description = "Verify that the website handle the failed payments (2.56)")
    public void ValidaFailedPayment256(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getRedeemButton().click();
        paymentDetailsPage.getRedeemAmount().sendKeys ("172.44");
        paymentDetailsPage.getApplyRedeemPoints().click();
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("visaCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);
        ConfirmationPage confirmationPage = new ConfirmationPage(getDriver ());
        SharedMethods.waitUntilElementVisible (confirmationPage.getBookingConfirmation ());
        Assert.assertTrue (confirmationPage.getBookingConfirmation ().isDisplayed ());
    }
    @Test(description = "Verify that the website handle the failed payments (2.57)")
    public void ValidaFailedPayment257(){
        SKiHomePage sKiHomePage= new SKiHomePage(getDriver());
        sKiHomePage.getAcceptCookiesButton().click();
        SharedMethods.waitTillClickAble (sKiHomePage.getSignInButton ());
        sKiHomePage.getSignInButton ().click ();
        LoginPage loginPage = new LoginPage (getDriver ());
        loginPage.getUserName ().sendKeys ( objXMLReader.getXMLData ("userName"));
        loginPage.getPassword ().sendKeys ( objXMLReader.getXMLData ("passWord"));
        loginPage.getLoginCTA ().click ();
        SharedMethods.threadSleep (12000);
        SharedMethods.waitUntilElementVisible (sKiHomePage.getPassesAndPackages ());
        SharedMethods.clickAction (sKiHomePage.getPassesAndPackages ());
        SharedMethods.waitUntilElementVisible(sKiHomePage.getSnowParkOption());
        sKiHomePage.getSnowParkOption().click();
        PassesAndPackages passesAndPackages = new PassesAndPackages(getDriver());
        SharedMethods.waitUntilElementVisible (passesAndPackages.getSnowParkPassesHeader ());
        SharedMethods.jsScrollDown (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.waitUntilElementClickable (passesAndPackages.getSnowParkPassBuyButton());
        SharedMethods.mouseClickAction (passesAndPackages.getSnowParkPassBuyButton ());
        SharedMethods.threadSleep (3000);
        AddOnsScreen addOnsScreen = new AddOnsScreen(getDriver ());
        SharedMethods.clickOn(addOnsScreen.getContinueButton ());
        PersonalDetailsPage personalDetailsPage = new PersonalDetailsPage(getDriver ());
        SharedMethods.waitTillClickAble (personalDetailsPage.getContinueToPayment());
        personalDetailsPage.getContinueToPayment ().click ();
        SharedMethods.threadSleep (3000);
        PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage (getDriver ());
        SharedMethods.waitUntilElementVisible(paymentDetailsPage.getPaymentHead());
        paymentDetailsPage.getRedeemButton().click();
        SharedMethods.threadSleep (3000);
        paymentDetailsPage.getRedeemAmount().sendKeys ("172.43");
        paymentDetailsPage.getApplyRedeemPoints().click();
        paymentDetailsPage.getCardNumberField ().sendKeys (objXMLReader.getXMLData ("visaCard1"));
        SharedSteps.userFillCCInfo(objXMLReader.getXMLData ("cardExp"), objXMLReader.getXMLData ("cardCSV"));
        SharedMethods.threadSleep (1000);
        SharedMethods.waitTillClickAble (paymentDetailsPage.getPay ());
        paymentDetailsPage.getPay ().click ();
        SharedMethods.threadSleep (5000);

    }
}
