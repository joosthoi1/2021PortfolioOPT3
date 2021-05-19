import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AdviesTest {
    @Test
    void magAdviesKrijgenTest() {
        Advies advies = Advies.getInstance();
        advies.addClub("GMHC");
        assertTrue(advies.magAdviesKrijgen(true, "GMHC", false));
        assertFalse(advies.magAdviesKrijgen(false, "GMHC", false));
        assertFalse(advies.magAdviesKrijgen(true, "HCRB", false));
        assertTrue(advies.magAdviesKrijgen(false,"HCRB",true));
    }
    @Test
    void krijgAdviesTest() {
        Advies advies = Advies.getInstance();
        advies.addClub("GMHC");

        assertEquals(advies.geefSuggestie(0,0,"Pasing",0).getCategorie(), 1);
        assertEquals(advies.geefSuggestie(0,1,"Afronding",1).getCategorie(), 3);
        assertEquals(advies.geefSuggestie(1,0,"Afronding",0).getCategorie(), 2);
        assertEquals(advies.geefSuggestie(1,1,"Pasing",1).getCategorie(), 4);
        assertEquals(advies.geefSuggestie(2,0,"Pasing",1).getCategorie(), 4);
        assertEquals(advies.geefSuggestie(2,1,"Afronding",0).getCategorie(), 4);
    }
}
