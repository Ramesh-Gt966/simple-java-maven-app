import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest5 {

    @Test
    void testGreetWithNull() {
        App app = new App();
        String result = app.greet(null);
        assertEquals("Hello, World!", result, "Greet should return default message for null input");
    }

    @Test
    void testGreetWithEmptyString() {
        App app = new App();
        String result = app.greet("");
        assertEquals("Hello, World!", result, "Greet should return default message for empty string");
    }

    @Test
    void testGreetWithSpecialCharacters() {
        App app = new App();
        String result = app.greet("!@#$%^&*()");
        assertEquals("Hello, !@#$%^&*()!", result, "Greet should handle special characters correctly");
    }

    @Test
    void testGreetWithLongInput() {
        App app = new App();
        String longInput = "This is a very long input string to test the greet method.";
        String result = app.greet(longInput);
        assertEquals("Hello, " + longInput + "!", result, "Greet should handle long input correctly");
    }

    @Test
    void testGreetWithNumericInput() {
        App app = new App();
        String result = app.greet("12345");
        assertEquals("Hello, 12345!", result, "Greet should handle numeric input correctly");
    }
}