package helper;
import railwayEntity.*;
import railwayEntity.berth.LowerBerth;

public class TicketPrintHelper{
    static public  void printBookedTickets(){
        RailwayManagement railwayManagement = new RailwayManagement();
        System.out.println("Booked tickets details :-");
        for(Integer pId : railwayManagement.getBookedPassengersList()){
            System.out.println(railwayManagement.getPassenger(pId));
        }
    }

    static public void printAvailableTickets(){
        RailwayManagement railwayManagement = new RailwayManagement();
        System.out.println("Available tickets:-");
        System.out.println("Available seats in Lower berth  : "+railwayManagement.getAvailableTickets("L"));
        System.out.println("Available seats in Middle berth : "+railwayManagement.getAvailableTickets("M"));
        System.out.println("Available seats in Upper berth  : "+railwayManagement.getAvailableTickets("U"));
        System.out.println("Available seats in RAC          : "+railwayManagement.getAvailableTickets("RAC"));
        System.out.println("Available seats in Waiting list : "+railwayManagement.getAvailableTickets("WL"));

    }

}
