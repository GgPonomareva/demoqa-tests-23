import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CodeSnippets {

    @BeforeAll
    static void onSettings() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void  selenideTest(){
        //Откройте страницу Selenide в Github
        open("/selenide/selenide");

        //Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        //Найдите Build script
        $(".details-reset").click();
        $(".Truncate-text text-bold py-1").sendKeys("Build script");








        sleep(5000);

    }
}