package owner;

import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {
private WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new WebDriverProvider().get();
    }

    @Test
    public void githubTest() {

        String title = driver.getTitle();
        assertEquals("GitHub: Let’s build from here · GitHub", title);

    }



    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
