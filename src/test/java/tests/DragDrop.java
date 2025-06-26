package tests;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.DragAndDropOptions.to;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.exactTextsCaseSensitiveInAnyOrder;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.ProcessBuilder.Redirect.to;

public class DragDrop {
    @BeforeAll
    static void onSettings() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
        Configuration.pageLoadStrategy = "eager";
}

@Test
void CheckForm(){
        open("drag_and_drop");
    // Подвинуть курсор к элементу, кликнуть и держать, передвинуть по X и Y, отпустить кнопку мыши
    actions().moveToElement($("#column-a")).clickAndHold().moveByOffset(200, 0).release().perform();
        sleep(5000);
    }

    @Test
    void CheckForm2(){
        open("drag_and_drop");
        $("#column-a").dragAndDrop(to("#column-b"));
        sleep(5000);
    }
}



