package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import static org.testng.Assert.assertEquals;

public class FillFormPage {

    public By firstname = By.id("firstname");
    public By lastname = By.id("surname");
    public By age = By.id("age");
    public By country = By.id("country");
    public By notes = By.id("notes");
    public By submit = By.xpath("//input[@type='submit']");
    public By validationResponse = By.tagName("h1");

    public FillFormPage enterFirstname(String firstname){
        Driver.getDriver().findElement(this.firstname).sendKeys(firstname);
        return this;
    }

    public FillFormPage enterLastname(String lastname){
        Driver.getDriver().findElement(this.lastname).sendKeys(lastname);
        return this;
    }

    public FillFormPage enterAge(String age){
        Driver.getDriver().findElement(this.age).sendKeys(age);
        return this;
    }

    public FillFormPage chooseCountry(String country){
        new Select(Driver.getDriver().findElement(this.country)).selectByVisibleText(country);
        return this;
    }

    public FillFormPage enterNotes(String notes){
        Driver.getDriver().findElement(this.notes).sendKeys(notes);
        return this;
    }

    public FillFormPage clickSubmit(){
        Driver.getDriver().findElement(submit).click();
        return this;
    }
    public FillFormPage validateResponse(){
        assertEquals(Driver.getDriver().findElement(validationResponse).getText(), "Input Validation Response");
        return this;
    }


}
