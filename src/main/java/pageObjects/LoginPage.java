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
