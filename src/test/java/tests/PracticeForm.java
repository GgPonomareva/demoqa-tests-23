package tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PracticeForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
}

@Test
void StudentRegistrationForm() {

        //Поле на UI для ввода значения
    open("/automation-practice-form");
    $("#firstName").setValue("Galina");
    $("#lastName").setValue("Ponomareva");
    $("#userEmail").setValue("li.c@mail.ru");

    //Чекбокс c текстом, где нужен выбор
    $("#genterWrapper").$(byText("Female")).click();


    //Поле на UI для ввода значения
    $("#userNumber").setValue("9096201212");

    //Календарь
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOption("November");
    $(".react-datepicker__year-select").selectOption("2000");
    $(".react-datepicker__day--030", 1).click(); //в календаре отображается текущий и предыдущий месяц, нужно выбрать текущий

    //Выпадающий список + чекбокс c текстом
    $("#subjectsInput").setValue("Eng").pressEnter();
    $("#hobbiesWrapper").$(byText("Reading")).click();

    //Добавить аттачмент (аттач должен лежать в  папке resources(ее располагать в папке test), важно, чтобы она была помечена системным маркером
    $("#uploadPicture").uploadFromClasspath("123.JPG");
    $("#currentAddress").setValue("Russia, Moscow");

    //Выбратьь из выпадающего списка и после нажать Enter
    $("#state").click();
    $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
    $("#city").click();
    $("#react-select-4-input").setValue("Lucknow").pressEnter();

    $("#submit").click();
    $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
    $(".table-responsive").shouldHave(Condition.text("Student Name Galina Ponomareva"));
    $(".table-responsive").shouldHave(Condition.text("Student Email li.c@mail.ru"));
    $(".table-responsive").shouldHave(Condition.text("Gender Female"));
    $(".table-responsive").shouldHave(Condition.text("Mobile 9096201212"));
    $(".table-responsive").shouldHave(Condition.text("Date of Birth 30 November,2000"));
    $(".table-responsive").shouldHave(Condition.text("Subjects English"));
    $(".table-responsive").shouldHave(Condition.text("Hobbies Reading"));
    $(".table-responsive").shouldHave(Condition.text("Picture 123.JPG"));
    $(".table-responsive").shouldHave(Condition.text("Address Russia, Moscow"));
    $(".table-responsive").shouldHave(Condition.text("State and City Uttar Pradesh Lucknow"));


    }
}



