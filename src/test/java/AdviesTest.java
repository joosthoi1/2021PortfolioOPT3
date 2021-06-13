import Training.Advies;
import Training.Trainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class AdviesTest {
    @Test
    void magAdviesKrijgenTest() {
        Advies advies = Advies.getInstance();
        advies.addClub("GMHC");

        ;
        Assertions.assertTrue(advies.magAdviesKrijgen(new Trainer("joost", "GMHC",false)));
        Assertions.assertFalse(advies.magAdviesKrijgen(new Trainer("joost", null,false)));
        Assertions.assertFalse(advies.magAdviesKrijgen(new Trainer("joost", "HCRB",false)));
        Assertions.assertTrue(advies.magAdviesKrijgen(new Trainer("joost", null,true)));
    }
    @Test
    void krijgAdviesTest() {
        Advies advies = Advies.getInstance();
        advies.addClub("GMHC");

        Assertions.assertEquals(advies.geefSuggestie(0,0,"Pasing",0).getCategorie(), 1);
        Assertions.assertEquals(advies.geefSuggestie(0,1,"Afronding",1).getCategorie(), 3);
        Assertions.assertEquals(advies.geefSuggestie(1,0,"Afronding",0).getCategorie(), 2);
        Assertions.assertEquals(advies.geefSuggestie(1,1,"Pasing",1).getCategorie(), 4);
        Assertions.assertEquals(advies.geefSuggestie(2,0,"Pasing",1).getCategorie(), 4);
        Assertions.assertEquals(advies.geefSuggestie(2,1,"Afronding",0).getCategorie(), 4);
    }
}