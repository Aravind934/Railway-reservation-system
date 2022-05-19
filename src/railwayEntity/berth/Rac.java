package railwayEntity.berth;

import railwayEntity.Berth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Rac extends  ParentBerth implements Berth {
    private static Integer availableTickets = 1;
    private static ArrayList<Integer> ticketNumbers = new ArrayList<>((Arrays.asList(1)));
    private static Queue<Integer> passengersList = new LinkedList<>();
    public void addToPassengersList(int passengerId){
        passengersList.add(passengerId);
    }
    private  static  Rac rac;
    private  Rac(){

    }
    public static Rac getInstance(){
        if(rac==null) rac =  new Rac();
        return  rac;
    }
    @Override
    public int getPassenger(){
        return passengersList.poll();
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
