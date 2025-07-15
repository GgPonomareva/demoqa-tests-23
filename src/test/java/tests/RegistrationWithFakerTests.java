package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;



public class RegistrationWithFakerTests extends TestBase {


    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulFullFormTest() {

        registrationPage.openPage()
                .closeReclame()
                .setFirstName(TestValues.firstName)
                .setLastName(TestValues.lastName)
                .setEmail(TestValues.email)
                .setGender(TestValues.gender)
                .setUserNumber(TestValues.userNumber )
                .setCalendar()
                .setDateOfBirth(TestValues.date, TestValues.months, TestValues.year)
                .setSubjects(TestValues.subjects)
                .setHobbies(TestValues.hobbies)
                .setUploadPicture(TestValues.picture)
                .setCurrentAdress(TestValues.currentAdress)
                .selectState(TestValues.state)
                .selectCity(TestValues.cities)
                .submit()
                .checkForm();

        registrationPage.checkResult("Student Name", TestValues.firstName + " " + TestValues.lastName)
                .checkResult("Student Email", TestValues.email)
                .checkResult("Gender", TestValues.gender)
                .checkResult("Mobile", TestValues.userNumber)
                .checkResult("Date of Birth", TestValues.date + " " + TestValues.months + "," + TestValues.year)
                .checkResult("Subjects", TestValues.subjects)
                .checkResult("Hobbies", TestValues.hobbies)
                .checkResult("Picture", TestValues.picture)
                .checkResult("Address", TestValues.currentAdress)
                .checkResult("State and City", TestValues.state + " " + TestValues.cities);

    }

    @Test
    void successfulMinFormTest() {

        registrationPage.openPage()
                .closeReclame()
                .setFirstName(TestValues.firstName)
                .setLastName(TestValues.lastName)
                .setUserNumber(TestValues.userNumber)
                .setGender(TestValues.gender)
                .submit()
                .checkForm();


        registrationPage.checkResult("Student Name", TestValues.firstName + " " + TestValues.lastName)
                .checkResult("Mobile", TestValues.userNumber)
                .checkResult("Gender", TestValues.gender);
    }

    @Test
    void negativeMinFormTest() {

        registrationPage.openPage()
                .closeReclame()
                .setFirstName(" ")
                .setLastName(TestValues.lastName)
                .setEmail(TestValues.email)
                .setUserNumber(TestValues.userNumber)
                .submit();
        registrationPage.checkValidationErrors();
    }
}