import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest2 {

    @Test
    public void testGreetWithDifferentInputs() {
        App app = new App();
        
        // Test with a standard name
        assertEquals("Hello, John!", app.greet("John"));
        
        // Test with a different name
        assertEquals("Hello, Alice!", app.greet("Alice"));
        
        // Test with a name containing special characters
        assertEquals("Hello, O'Connor!", app.greet("O'Connor"));
        
        // Test with a name that includes numbers
        assertEquals("Hello, User123!", app.greet("User123"));
        
        // Test with a long name
        assertEquals("Hello, A very long name that exceeds typical lengths!", app.greet("A very long name that exceeds typical lengths!"));
    }
}