package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import pageObjects.LoginPage;

public class StepDefinition_LoginPage {

    public WebDriver driver;
    public LoginPage lp;

    @Given("I launch Chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\noe.cardenas\\REPOS\\ESCALA\\Selenium_framework_0.1\\src\\main\\drivers\\chromedriver.exe");
        ChromeDriverService service = new ChromeDriverService.Builder().withLogOutput(System.out).build();
        driver = new ChromeDriver(service);
        lp = new LoginPage(driver);
    }

    @Then("I open the page \"([^\"]*)\"$")
    public void i_upen_the_page(String url) {
        driver.get(url);
    }

    @Then("I type my user as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_type_my_user_as_and_password_as(String user, String password) {
        lp.setUsername(user);
        lp.setPassword(password);
    }
     @Then("I type my user as \"([^\"]*)\"$")
    public void i_type_my_user_as(String user) {
        lp.setUsername(user);
    }

    @Then("I type my password as \"([^\"]*)\"$")
    public void i_type_my_password_as(String password) {
        lp.setPassword(password);
    }

    @Then("I click (?:\\w+) button$")
    public void i_click_button() {
        lp.clickLogIn();
    }

    @Then("I close the browser window$")
    public void IcloseBrowser(){
        driver.quit();
    }

    @Then("I validate the error wrong email message is displayed as: \"([^\"]*)\"$")
    public void validateWrongEmailMessage (String mssg){
        String field = String.valueOf(lp.txtErrorMessage().getText());
        Assert.assertEquals(mssg, field);
    }

    @Then("I validate the unsuccessful login message is displayed as: \"([^\"]*)\"$")
    public void validateMessage (String mssg){
        String field = String.valueOf(lp.TxtDetailedLoginError().getText());
        field.replaceAll("/(\\r\\n|\\n|\\r)/gm","");
        Assert.assertEquals(mssg, field);
    }






}
