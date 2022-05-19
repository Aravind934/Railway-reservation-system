package options;
import helper.TicketPrintHelper;

public class PrintBookedTickets implements Options{
    @Override
    public void run() {
        TicketPrintHelper.printBookedTickets();
    }
}
