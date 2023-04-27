package com.herokuapp;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DrugAndDropTest {

    @Test
    void drugAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").$("header").shouldBe(text("B"));
        $("#column-b").$("header").shouldBe(text("A"));
    }
}
