import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;


@RunWith(SerenityRunner.class)
public class CalcTest {

    @Steps
    private Calc calc;

    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void sum() {
        assertEquals(this.calc.sum(3, 5), 8);
    }

    @Test
    public void min() {
    }

    @Test
    public void mul() {
    }
}