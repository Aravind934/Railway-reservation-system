package options;
import helper.TicketPrintHelper;
public class PrintAvailableTickets implements Options{
    @Override
    public void run() {
        TicketPrintHelper.printAvailableTickets();
    }
}
