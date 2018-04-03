package com.test.tutorial.serenity.ui;

import com.test.tutorial.serenity.models.SiteArea;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class SiteAreaNavigation extends PageObject {
    public void selectArea(SiteArea siteArea) {
        $("#pages").click();
        $("*[role=menu] li").find(By.linkText(siteArea.name())).click();
    }
}