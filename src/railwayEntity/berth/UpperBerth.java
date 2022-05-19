package railwayEntity.berth;

import railwayEntity.Berth;

import java.util.ArrayList;
import java.util.Arrays;

public class UpperBerth extends ParentBerth implements Berth {
    private  static  UpperBerth upperBerth;
    private static Integer availableTickets = 1;
    private static ArrayList<Integer> ticketNumbers = new ArrayList<>((Arrays.asList(1)));
    private  UpperBerth(){}
    public static UpperBerth getInstance(){
        if(upperBerth==null)upperBerth =  new UpperBerth();
        return  upperBerth;
    }
    @Override
    public int getAvailableTickets() {
        return availableTickets;
    }

    @Override
    public void increaseAvailableTicket() {
        ++availableTickets;
    }

    @Override
    public void decreaseAvailableTicket() {
        --availableTickets;
    }
    @Override
    public int getTicketNumber() {
        return ticketNumbers.remove(0);
    }

    @Override
    public void addTicketNumber(int no) {
        ticketNumbers.add(no);
    }
}
