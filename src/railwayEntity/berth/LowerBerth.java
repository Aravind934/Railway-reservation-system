package railwayEntity.berth;

import railwayEntity.Berth;

import java.util.ArrayList;
import java.util.Arrays;

public class LowerBerth extends ParentBerth implements Berth {
    private  static  LowerBerth lowerBerth;
    public static Integer availableTickets = 3;
    private static ArrayList<Integer> ticketNumbers = new ArrayList<>((Arrays.asList(1,2,3)));
 private  LowerBerth(){

 }
 public static Berth getInstance(){
     if(lowerBerth==null) lowerBerth =  new LowerBerth();
     return  lowerBerth;
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
