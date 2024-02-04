package JavaAdvanced.modulo3_DateTesting.ex9;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void dateTesting() {
        Main test = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String[] newdate = test.dateFormatter(date);
        assertEquals("2023",newdate[0]);
        assertEquals("MARCH",newdate[1]);
        assertEquals("1",newdate[2]);
        assertEquals("WEDNESDAY",newdate[3]);


    }
}
