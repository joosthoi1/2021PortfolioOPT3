import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class TrainingTest {
    @Test
    void voldoendeTijdTest() {
        ArrayList<Oefening> oefeningen = new ArrayList<Oefening>();
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new ConditieOefening(90,"test", 29)))).voldoendeTijd().equals("lang"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new ConditieOefening(91,"test", 29)))).voldoendeTijd().equals("lang"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new ConditieOefening(75,"test", 29)))).voldoendeTijd().equals("goed"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new HockeyOefening(76,"test", "test")))).voldoendeTijd().equals("goed"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new HockeyOefening(89, "test", "test")))).voldoendeTijd().equals("goed"));
        assertTrue(new Training(new ArrayList<Oefening>(Arrays.asList(new HockeyOefening(74, "test", "test")))).voldoendeTijd().equals("kort"));
    }

}
