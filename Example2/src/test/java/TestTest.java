import static org.junit.Assert.assertTrue;

import ecs100.UI;
import org.junit.Test;
public class TestTest {
    @Test
    public void testHello() {
        assertTrue(UI.askString("Test").equalsIgnoreCase("hello"));
    }
}
