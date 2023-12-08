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
        driver.manage().window().maximize();
    }

    @Then("I open the page \"([^\"]*)\"$")
    public void i_upen_the_page(String url) {
        driver.get(url);
    }

    @Then("I close the browser window$")
    public void IcloseBrowser(){
        driver.quit();
    }

    ////////////////////////////////////////
    @Then("I click in find a branch Link$")
    public void iClickFindABranch() throws InterruptedException {
        lp.ClickFindaBranch();
        Thread.sleep(3000);
    }

    @Then("I search the zip code \"([^\"]*)\"$")
    public void SearchByzipCode(String zip) throws InterruptedException {
        lp.SearchBy(zip);
        lp.ClickSearchBtn();
        Thread.sleep(3000);
    }

    @Then("I validate the link Credit Cards is displayed$")
    public void ValidateLinkCreditCards() {
        String creditCard = String.valueOf(lp.textCreditCards().getText());
        Assert.assertEquals(creditCard,"Credit Cards");
    }

    @Then("I validate the link Personal Loans is displayed$")
    public void ValidateLinkPersonalLoans() {
        String PersonalLoans = String.valueOf(lp.textPersonalLoans().getText());
        Assert.assertEquals(PersonalLoans,"Personal Loans");
    }

    @Then("I validate the link Investing is displayed$")
    public void ValidateLinkInvesting() {
        String investings = String.valueOf(lp.textInvesting().getText());
        Assert.assertEquals(investings,"Investing");
    }

    @Then("I validate the link Resources is displayed$")
    public void ValidateLinkResources() {
        String Resources = String.valueOf(lp.textResources().getText());
        Assert.assertEquals(Resources,"Resources");
    }

    @Then("I validate the location list has \"(\\d+)\" (?:elements|element)$")
    public void ListResult(String expected) {
        String actual = lp.listResults().getText();
        Assert.assertEquals(actual, expected);
    }

    @Then("I click the \"Choose the right checking account\" button$")
    public void clickRightCheckingBtn(){
        lp.clickBtnRightCheckingAcc();
    }

    @Then("I validate the Box Santander Select Checking is displayed$")
    public void validateBoxSantanderSelect() throws InterruptedException {
        Assert.assertTrue(lp.booleanSantanderSelectBox());
        Assert.assertEquals(lp.textSantanderSelectBox(),"Santander Select® Checking");
        Thread.sleep(5000);
    }

    @Then("I validate the Box simply Right Checking is displayed$")
    public void validateBoxSimplyRight(){
        Assert.assertTrue(lp.booleanSimplyRightChecking());
        Assert.assertEquals(lp.textSimplyRightChecking(),"Simply Right®\n"+"Checking");
    }

    @Then("I validate the Box Santander essential Checking is displayed$")
    public void validateBoxEssentialChecking(){
        Assert.assertTrue(lp.booleanEssentialChecking());
        Assert.assertEquals(lp.textEssentialChecking(),"Santander® Essential Checking");
    }


























    ////////////////////////////////////////
}
