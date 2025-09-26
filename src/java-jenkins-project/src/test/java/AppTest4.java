import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest4 {

    @Test
    void testGreetPerformance() {
        App app = new App();
        long startTime = System.currentTimeMillis();
        
        // Simulate load by calling greet multiple times
        for (int i = 0; i < 1000; i++) {
            app.greet();
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        // Assert that the method completes within a reasonable time frame
        assertTrue(duration < 1000, "Greet method took too long to execute under load");
    }
}