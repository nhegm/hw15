import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AviaSoulsTest {

    @Test
    public void TicketsCompareTest() {
        Ticket ticket1 = new Ticket("Belogorsk", "Sochi", 23167, 10_00, 16_00);
        Ticket ticket2 = new Ticket("Vladivostok", "Moskva", 32489, 07_00, 11_00);
        Ticket ticket3 = new Ticket("Ulan-Ude", "Novosibirsk", 17980, 06_00, 9_00);
        Ticket ticket4 = new Ticket("Orlean", "New-York", 32489, 05_00, 13_00);

        int expectedLess = -1;
        int expectedMore = 1;
        int expectedEqual = 0;

        Assertions.assertEquals(expectedLess, ticket1.compareTo(ticket2));
        Assertions.assertEquals(expectedEqual, ticket2.compareTo(ticket4));
        Assertions.assertEquals(expectedMore, ticket2.compareTo(ticket3));
    }

    @Test
    public void TicketsAddAndSearchAndSortTest() {
        Ticket ticket1 = new Ticket("Belogorsk", "Sochi", 23167, 10_00, 16_00);
        Ticket ticket2 = new Ticket("Vladivostok", "Moskva", 32489, 07_00, 11_00);
        Ticket ticket3 = new Ticket("Ulan-Ude", "Novosibirsk", 17980, 06_00, 9_00);
        Ticket ticket4 = new Ticket("Orlean", "New-York", 55489, 05_00, 13_00);
        Ticket ticket5 = new Ticket("Orlean", "New-York", 32489, 8_00, 11_00);

        Ticket[] expected = {ticket5, ticket4};
        AviaSouls aviaSouls = new AviaSouls();
        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);

        Assertions.assertArrayEquals(expected, aviaSouls.search("Orlean", "New-York"));
    }
}
