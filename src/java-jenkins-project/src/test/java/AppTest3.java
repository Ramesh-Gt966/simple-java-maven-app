import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest3 {

    @Test
    public void testGreetWithNull() {
        App app = new App();
        String result = app.greet(null);
        assertEquals("Hello, World!", result);
    }

    @Test
    public void testGreetWithEmptyString() {
        App app = new App();
        String result = app.greet("");
        assertEquals("Hello, World!", result);
    }
}