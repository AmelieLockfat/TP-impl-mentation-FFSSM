
/**
 * @(#) Club.java
 */


import FFSSM.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFFSSM {

    Plongeur P1;
    Plongeur P2;
    Plongeur P3;
    Moniteur M1;
    Moniteur M2;
    Club ClubSandwich;
    Site RUN;
    Plongee Pl1;
    Plongee Pl2;

    public void setUp() {
        P1=new Plongeur("95","Dupont","Jean",)

    }

    @Test
    public void testAjouteLicence() throws Exception{
        P2.ajouteLicence("123AM",LocalDate.of(2022,12,12));
        assertEquals(P2, P2.derniereLicence().getPossesseur(),
                "La licence n'a pas été ajoutée au bon plongeur");
        assertEquals(ClubSandwich,P2.derniereLicence().getClub(),"Club délivrant incorrect");
    }

}

