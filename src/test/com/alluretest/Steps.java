
import org.junit.Test;
import io.qameta.allure.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertNotNull;

public class Steps {
    @Step("Assert not null")
    public void assertNN() {
        assertNotNull("dsfgds");
    }

    @Step("Assert true")
    public void assertTR() {
        assertTrue(true);
    }

    @Step("Step that always fails")
    public void fail() {
        assertTrue(false);
    }

    @Step("Checking if object is null")
    public void checkIfNull(Object a) {
        assertNotNull(a);
    }
}
