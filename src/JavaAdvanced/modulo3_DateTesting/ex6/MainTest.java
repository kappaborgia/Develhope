package JavaAdvanced.modulo3_DateTesting.ex6;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void sum() {
        Main test = new Main();

        assertEquals(Main.sum(1,3),4);

    }
}