import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int flightTimeTicket1 = t1.getTimeTo() - t1.getTimeFrom();
        int flightTimeTicket2 = t2.getTimeTo() - t2.getTimeFrom();
        if (flightTimeTicket1 < flightTimeTicket2) {
            return -1;
        } else if (flightTimeTicket1 > flightTimeTicket2) {
            return 1;
        } else {
            return 0;
        }
    }
}