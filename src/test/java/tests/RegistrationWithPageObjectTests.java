package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationPage;


public class RegistrationWithPageObjectTests extends TestBase {


    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void successfulFullFormTest() {

        registrationPage.openPage()
                .closeReclame()
                .setFirstName("Galina")
                .setLastName("Ponomareva")
                .setEmail("li.c@mail.ru")
                .setGender("Female")
                .setUserNumber("9096201212")
                .setCalendar()
                .setDateOfBirth("18", "November", "1999")
                .setSubjects("English")
                .setHobbies("Sports")
                .setUploadPicture("img/summer.jpg")
                .setCurrentAdress("Russia, Moscow")
                .selectState("Uttar Pradesh")
                .selectCity("Lucknow")
                .submit()
                .checkForm();

        registrationPage.checkResult("Student Name", "Galina" + " " + "Ponomareva")
                .checkResult("Student Email", "li.c@mail.ru")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "9096201212")
                .checkResult("Date of Birth", "18" + " " + "November" + "," + "1999")
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "summer.jpg")
                .checkResult("Address", "Russia, Moscow")
                .checkResult("State and City", "Uttar Pradesh" + " " + "LucKnow");

    }

    @Test
    void successfulMinFormTest() {
        registrationPage.openPage()
                .closeReclame()
                .setFirstName("Galina")
                .setLastName("Ponomareva")
                .setUserNumber("9096201212")
                .setGender("Female")
                .submit()
                .checkForm();


        registrationPage.checkResult("Student Name", "Galina" + " " + "Ponomareva")
                .checkResult("Gender", "Female")
                .checkResult("Mobile", "9096201212");

    }

    @Test
    void negativeMinFormTest() {

        registrationPage.openPage()
                .closeReclame()
                .setFirstName(" ")
                .setLastName("Ponomareva")
                .setEmail("li.c@mail.ru")
                .setUserNumber("9096201212")
                .submit();
        registrationPage.checkValidationErrors();
    }
}