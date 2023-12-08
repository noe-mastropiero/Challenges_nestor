package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath="//*[@id=\"Email\"]")
        @CacheLookup
        WebElement txtEmail;

    @FindBy(xpath="//*[@id=\"Password\"]")
        @CacheLookup
        WebElement txtPassword;

    @FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
        @CacheLookup
        WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"RememberMe\"]")
        @CacheLookup
        WebElement checkBoxRememberMe;

    @FindBy(xpath="//*[@id=\"Email-error\"]")
        @CacheLookup
        WebElement TxtEmailError;

    @FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]")
        @CacheLookup
        WebElement TxtUnsuccessLogin;

    @FindBy(xpath ="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]/ul/li")
        @CacheLookup
        WebElement TxtDetailLoginError;
/////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath="//*[@id=\"fragment-8781891-xjas\"]/div/div/div[1]/div[4]/div/p/a[1]")
    WebElement LinkFindaBranch;

    @FindBy(xpath="//*[@id=\"q\"]")
    WebElement SearchBarLocations;

    @FindBy(xpath="//*[@id=\"search-button\"]")
    WebElement BtnSearch;

    @FindBy(xpath="//*[@id=\"rnavcont\"]/div[2]/div/nav/ul/li[2]/a/span")
    WebElement LinkCreditCards;

    @FindBy(xpath="//*[@id=\"rnavcont\"]/div[2]/div/nav/ul/li[3]/a/span")
    WebElement LinkPersonalLoans;

    @FindBy(xpath="//*[@id=\"rnavcont\"]/div[2]/div/nav/ul/li[4]/a/span")
    WebElement LinkInvesting;

    @FindBy(xpath="//*[@id=\"rnavcont\"]/div[2]/div/nav/ul/li[5]/a/span")
    WebElement LinkResources;

    @FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[1]/div[1]/div[2]/div/span[1]")
    WebElement MapListResult;

    @FindBy(xpath="//*[@id=\"buttonId\"]/div/a")
    WebElement BtnChooseRightAccount;

    @FindBy(xpath="//*[@id=\"fragment-0-lcba\"]/div/div/div/div/div/h3")
    WebElement BoxSantanderSelect;

    @FindBy(partialLinkText="Simply Right")
    WebElement BoxSimplyRight;

    @FindBy(xpath = "//*[@id=\"fragment-0-gbte\"]/div/div/div/div/div/h3")
    WebElement BoxEsentialChecking;





    public void ClickFindaBranch(){
        LinkFindaBranch.click();
    }

    public void SearchBy(String zipCode){
        SearchBarLocations.click();
        SearchBarLocations.sendKeys(zipCode);
    }

     public void ClickSearchBtn(){
        BtnSearch.click();
    }

    public WebElement textCreditCards(){
        return LinkCreditCards;
    }

    public WebElement textPersonalLoans(){
        return LinkPersonalLoans ;
    }

    public WebElement textInvesting(){
        return LinkInvesting;
    }

    public WebElement textResources(){
        return LinkResources;
    }

    public WebElement listResults(){
        return MapListResult;
    }

    public void  clickBtnRightCheckingAcc(){
        BtnChooseRightAccount.click();
    }

    public String textSantanderSelectBox(){
      return  BoxSantanderSelect.getText();
    }

    public boolean booleanSantanderSelectBox(){
        return BoxSantanderSelect.isDisplayed();
    }

    public String textSimplyRightChecking(){
        return  BoxSimplyRight.getText();
    }

    public boolean booleanSimplyRightChecking(){
        return BoxSimplyRight.isDisplayed();
    }

    public String textEssentialChecking(){
        return  BoxEsentialChecking.getText();
    }

    public boolean booleanEssentialChecking(){
        return BoxEsentialChecking.isDisplayed();
    }





















//////////////////////////////////////////////////////////////////////////////
    public void setUsername(String user){
        txtEmail.clear();
        txtEmail.sendKeys(user);
    }

    public void setPassword(String password){
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickLogIn(){
        btnLogin.click();
    }

    public void clickRememberMe(){
        checkBoxRememberMe.click();
    }

    public WebElement txtErrorMessage(){return TxtEmailError;}
    public WebElement txtUnuccessLogin(){return TxtUnsuccessLogin;}
    public WebElement TxtDetailedLoginError(){return TxtDetailLoginError;}


}
