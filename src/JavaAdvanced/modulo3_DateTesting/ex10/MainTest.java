package JavaAdvanced.modulo3_DateTesting.ex10;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void dateTesting() {
        Main myDate = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String[] newDate = myDate.dateFormatter(date);
        assertEquals("2024-02-08T13:00Z", newDate[0]);


    }
}