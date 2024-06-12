package tests;

import org.testng.annotations.Test;
import pages.FillFormPage;
import utilities.Driver;

public class C06_HW_34 {


/*
    Go to https://testpages.eviltester.com/styled/validation/input-validation.html
    Fill form and submit
    Do this with 3 scenarios
    Use Fluent Page project
*/


    @Test
    void fillFormTest() {

        FillFormPage formPage = new FillFormPage();

        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        formPage.enterFirstname("Johannes")
                .enterLastname("van der Vries")
                .enterAge("30")
                .chooseCountry("India")
                .enterNotes("Hello World!")
                .clickSubmit()
                .validateResponse()
        ;
        Driver.closeDriver();
    }

    @Test
    void fillFormTest2() {
        FillFormPage fillFormPage = new FillFormPage();

        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        fillFormPage
                .enterFirstname("Ali")
                .enterLastname("Schwarzenegger")
                .enterAge("45")
                .chooseCountry("Turkey")
                .enterNotes("Merhaba")
                .clickSubmit()
                .validateResponse()
        ;

        Driver.closeDriver();
    }

    @Test
    void fillFormTest3() {
        FillFormPage fillFormPage = new FillFormPage();

        Driver.getDriver().get("https://testpages.eviltester.com/styled/validation/input-validation.html");

        fillFormPage
                .enterFirstname("Raju")
                .enterLastname("Schwarzenegger")
                .enterAge("25")
                .chooseCountry("India")
                .enterNotes("Namaste")
                .clickSubmit()
                .validateResponse()
        ;

        Driver.closeDriver();
    }

}
