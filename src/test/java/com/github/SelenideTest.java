package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
        void checkPageEnterprize() {
        open("https://github.com/");
        $x("//button[contains(text(), 'Solutions')]").hover();
        $x("//li/a[contains(text(), ' Enterprise')]").click();
        $x("//div/h1[text()='Build like the best']").shouldHave(text("Build like the best"));
        Configuration.timeout = 30000;
    }
}
