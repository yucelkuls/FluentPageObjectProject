package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage {

    private WebDriver driver;

    public ContactListPage() { //Bu constructor default constructor yerine gececektir.
        // Cunku Java da parametreli bir constructor olusturdu isek default olan yok olmus olur.
        // Bu yuzden bos cons. yeniden generate ettik.
    }

    public ContactListPage(WebDriver driver) {
        this.driver = driver;
    }

    //Buraya test class'larinda yada fluent page class'larinda kullanilacak "By" objelerini koyuyoruz.
    public By email = By.id("email");
    public By password = By.id("password");
    public By submit = By.id("submit");
    public By logout = By.id("logout");


    public ContactListPage enterEmail(String email){
        driver.findElement(this.email).sendKeys(email);
        return this;
    }

    public ContactListPage enterPassword(String password){
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public ContactListPage clickSubmit(){
        driver.findElement(this.submit).click();
        return this;
    }

    public ContactListPage assertLogout(){
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assert driver.findElement(this.logout).isDisplayed();
        return this;
    }

}
