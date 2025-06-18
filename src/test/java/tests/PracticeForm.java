package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

    //Чекбокс
    $("label[for='gender-radio-2']").click();

    //Поле на UI для ввода значения
    $("#userNumber").setValue("9096201212");

    //Календарь
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOption("November");
    $(".react-datepicker__year-select").selectOption("2000");
    $(".react-datepicker__day--030", 1).click(); //в календаре отображается текущий и предыдущий месяц, нужно выбрать текущий

    //Выпадающий список + чекбокс
    $("#subjectsInput").setValue("Eng").pressEnter();
    $("label[for='hobbies-checkbox-2']").click();

    //Добавить аттачмент (аттач должен лежать в  папке resources(ее располагать в папке test), важно, чтобы она была помечена системным маркером
    $("#uploadPicture").uploadFromClasspath("123.JPG");

    //Выбратьь из выпадающего списка и после нажать Enter
    $("#state").click();
    $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
    $("#city").click();
    $("#react-select-4-input").setValue("Lucknow").pressEnter();

    $("#submit").click();

    }
}



