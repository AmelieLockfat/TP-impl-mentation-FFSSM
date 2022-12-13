
/**
 * @(#) Club.java
 */


import FFSSM.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
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
    ArrayList<Licence> listevide = new ArrayList<Licence>();

    public void setUp() {
        P2=new Plongeur("95","Dupont","Jean","25 rue Fatigue","0992583656",LocalDate.of(2020,10,11),2,listevide,GroupeSanguin.BPLUS);

    }

    @Test
    public void testAjouteLicence() throws Exception{
       Licence licencetest= new Licence (P2,"1",LocalDate.of(2022,10,23),ClubSandwich);
       P2.ajouteLicence("1",LocalDate.of(2022,10,23));
       assertEquals(P2.derniereLicence(),licencetest,"non");

    }

}

