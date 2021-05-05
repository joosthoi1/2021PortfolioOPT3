import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdviesTest {
    @Test
    void magAdviesKrijgenTest() {
        Advies advies = new Advies(new String[] {"GMHC"});
        assertTrue(advies.magAdviesKrijgen(true, "GMHC", false));
        assertFalse(advies.magAdviesKrijgen(false, "GMHC", false));
        assertFalse(advies.magAdviesKrijgen(true, "HCRB", false));
        assertTrue(advies.magAdviesKrijgen(false,"HCRB",true));
    }
}
