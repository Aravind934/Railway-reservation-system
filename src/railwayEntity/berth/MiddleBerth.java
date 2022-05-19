package railwayEntity.berth;

import railwayEntity.Berth;

import java.util.ArrayList;
import java.util.Arrays;

public class MiddleBerth extends  ParentBerth implements Berth {
    private  static  MiddleBerth middleBerth;
    public static Integer availableTickets = 1;
    private static ArrayList<Integer> ticketNumbers = new ArrayList<>((Arrays.asList(1)));
    private  MiddleBerth(){

    }
    public static MiddleBerth getInstance(){
        if(middleBerth==null) middleBerth = new MiddleBerth();
        return  middleBerth;
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
