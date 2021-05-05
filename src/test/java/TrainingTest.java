import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class TrainingTest {
    @Test
    void voldoendeTijdTest() {
        ArrayList<Oefening> oefeningen = new ArrayList<Oefening>();
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new Oefening(90)))).voldoendeTijd().equals("lang"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new Oefening(91)))).voldoendeTijd().equals("lang"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new Oefening(75)))).voldoendeTijd().equals("goed"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new Oefening(76)))).voldoendeTijd().equals("goed"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new Oefening(89)))).voldoendeTijd().equals("goed"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new Oefening(74)))).voldoendeTijd().equals("kort"));
    }

}
