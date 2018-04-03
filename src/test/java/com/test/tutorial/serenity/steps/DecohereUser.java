package com.test.tutorial.serenity.steps;

import com.test.tutorial.serenity.models.SiteArea;
import com.test.tutorial.serenity.ui.CurrentPage;
import com.test.tutorial.serenity.ui.DecohereHomePage;
import com.test.tutorial.serenity.ui.LandingPage;
import com.test.tutorial.serenity.ui.SiteAreaNavigation;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class DecohereUser {
    private DecohereHomePage decohereHomePage;
    private LandingPage landingPage;
    private SiteAreaNavigation siteAreaNavigation;
    private CurrentPage currentPage;

    @Step
    public void isOnTheHomePage() {
        decohereHomePage.open();
    }
    @Step
    public void logsInAsAdmin() {
        decohereHomePage.loginAsAdmin();

    }
    @Step
    public void shouldBeOnLandingPage() {
        assertThat(landingPage.noticeMessage()).isEqualTo("You are now logged in as admind");
    }

    @Step
    public void navigatesToSiteArea(SiteArea siteArea) {
        siteAreaNavigation.selectArea(siteArea);
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }
}
