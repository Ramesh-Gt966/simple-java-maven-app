public class AppTest1 {
    private App app;

    @org.junit.Before
    public void setUp() {
        app = new App();
    }

    @org.junit.Test
    public void testGreet() {
        String expected = "Hello, World!";
        String actual = app.greet();
        org.junit.Assert.assertEquals(expected, actual);
    }
}