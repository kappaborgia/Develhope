package JavaAdvanced.modulo3_DateTesting.ex7;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void dateTesting() {
        Main myDate = new Main();
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String[] newDate = myDate.dateTesting(date);
        assertEquals("01/03/2002", newDate[0]);
        assertEquals("1 Mar 2002", newDate[1]);
        assertEquals("Friday, 1 March 2002", newDate[2]);
    }
}