package nl.hva.ict.ss;

import org.junit.Test;

import java.util.LinkedList;

import static junit.framework.TestCase.*;

/**
 * Put your tests that show you implemented the code correctly in this class.
 * Any test placed at a different class will be ignored!
 * Failing to add tests here will result in failing the assignment!
 */
public class ExtendedAdvancedSortingTest extends AdvancedSortingTest {

    static LinkedList<Player> extendedUnsortedPlayers = new LinkedList<>();

    @Test
    public void testArrayQuickSortSorts() {


        Player harry = new Player("Harry", "Potter", 100);
        Player onmisbareHenk = new Player("Henk", "Timmerman", 1000);
        Player papaPotter = new Player("James", "Potter", 95);
        Player harryDeTweede = new Player("Harry2", "Potter", 100);

        int numberOfPlayers = 4;

        extendedUnsortedPlayers.addLast(harry);
        extendedUnsortedPlayers.addLast(onmisbareHenk);
        extendedUnsortedPlayers.addLast(papaPotter);
        extendedUnsortedPlayers.addLast(harryDeTweede);

        Player[] players = getSubList(extendedUnsortedPlayers, numberOfPlayers).toArray(new Player[numberOfPlayers]);
        AdvancedSorts.quickSort(players);

        //for testing purpose
        System.out.println("sorted array:");
        for (Player pot : players) {
            System.out.println(pot + " ");
        }

        assertEquals(4, players.length);
        assertEquals(onmisbareHenk, players[0]);
    }
}
