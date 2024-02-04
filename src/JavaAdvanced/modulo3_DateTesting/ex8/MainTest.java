package JavaAdvanced.modulo3_DateTesting.ex8;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void dateTesting() {
        Main test = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String[] newDate = test.dateFormatter(date);
        assertEquals("1 March 2023", newDate[0] );

    }
}