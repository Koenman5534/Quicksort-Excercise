package nl.hva.ict.ss;

import org.junit.Test;

import java.util.LinkedList;

/**
 * Put your tests that show you implemented the code correctly in this class.
 * Any test placed at a different class will be ignored!
 * Failing to add tests here will result in failing the assignment!
 */
public class ExtendedAdvancedSortingTest extends AdvancedSortingTest {

    static LinkedList<Player> extendedUnsortedPlayers = new LinkedList<>();

    @Test
    public void quickSort() {


        Player harry = new Player("Harry", "Potter", 100);
        Player onmisbareHenk = new Player("Henk", "Timmerman", 1000);
        Player papaPotter = new Player("James", "Potter", 95);

        int numberOfPlayers = 2;

        extendedUnsortedPlayers.addLast(harry);
        extendedUnsortedPlayers.addLast(onmisbareHenk);
        extendedUnsortedPlayers.addLast(papaPotter);

        Player[] players = getSubList(extendedUnsortedPlayers, numberOfPlayers).toArray(new Player[numberOfPlayers]);
        AdvancedSorts.quickSort(players);

        System.out.println(players);

    }
}
