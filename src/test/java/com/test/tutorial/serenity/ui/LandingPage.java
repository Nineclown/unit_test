package com.test.tutorial.serenity.ui;

import net.serenitybdd.core.pages.PageObject;

public class LandingPage extends PageObject{
    public String noticeMessage() {
        return $(".notice").getText();
    }
}
