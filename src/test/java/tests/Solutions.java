package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTextsCaseSensitiveInAnyOrder;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Solutions {
    @BeforeAll
    static void onSettings() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
}

@Test
    void CheckForm() {
    //Откройте страницу
    open("/git-guides");

    //Выбрать: Меню -> Solutions -> Enterprize (с помощью команды hover для Solutions)
    $(byTagAndText("button","Solutions")).hover();

    //Нажать на Enterprises
    $(withText("Enterprises")).click();

    //Проверить заголовок: "The AI-powered developer platform.")
    $$("#hero-section-brand-heading").shouldHave(exactTextsCaseSensitiveInAnyOrder("The AI-powered developer platform"));

    }
    }
