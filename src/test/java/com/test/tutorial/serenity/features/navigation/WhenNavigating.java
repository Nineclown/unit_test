package com.test.tutorial.serenity.features.navigation;

import com.test.tutorial.serenity.models.SiteArea;
import com.test.tutorial.serenity.steps.DecohereUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenNavigating {
    @Steps
    private DecohereUser user;

    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToGoToOverlord() {
        user.isOnTheHomePage();
        user.logsInAsAdmin();

        user.navigatesToSiteArea(SiteArea.Overlord);

        user.shouldSeePageTitleContaining("Project Overlord");
    }
}