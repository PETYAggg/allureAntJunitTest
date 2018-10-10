import org.junit.runner.*;
import org.junit.*;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


public class MyClassTest {

    Steps steps = new Steps();

    @Test()
    public void testTwoTrueSteps() {
        final MyClass obj = new MyClass();
        steps.assertNN();
        steps.assertTR();
    }

    @Test()
    public void oneStepFail() {
        steps.fail();
    }

    @Test
    public void testNotNull() {
        MyClass instance = new MyClass();
        steps.checkIfNull(instance.generate());
    }


} 
