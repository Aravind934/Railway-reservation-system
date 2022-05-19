package helper;
import enumeration.BerthPreference;
import railwayEntity.*;
public class BookingHelper {
    public static void bookTicket(Passanger p , BerthPreference birthPref , Boolean isSystemBooked){
        Booker booker = new Booker();
        RailwayManagement railwayManagement = new RailwayManagement();

        if(railwayManagement.getAvailableTickets("WL")==0) {
            System.out.println("No tickets available");
        }

        if(p.getAge() <=5){
            System.out.println("Sorry you are under 5 .We couldn't move your application");
            railwayManagement.addToPassengers(railwayManagement.getPassengerId(),p);
        }

        if(p.getAge() >=60 && railwayManagement.getAvailableTickets("L") > 0 || p.getChildId()!=-1 && railwayManagement.getAvailableTickets("L") >0){
            if(!isSystemBooked) System.out.println("We will giving lower berth!");
            Integer tktNum = railwayManagement.getTicketNumber("L");
            Ticket tkt = new Ticket(birthPref);
            tkt.setNumber(tktNum);
            tkt.setAlotted("L");
            p.setTicket(tkt);
            booker.bookTicket(p,"L");
            railwayManagement.decreaseAvailableTicket("L");
        }

        else if(birthPref.equals(BerthPreference.L) && railwayManagement.getAvailableTickets("L") > 0 || birthPref.equals(BerthPreference.M) && railwayManagement.getAvailableTickets("M")>0 || birthPref.equals(BerthPreference.U) && railwayManagement.getAvailableTickets("U") > 0){
            if(birthPref.equals(BerthPreference.L)){
                if(!isSystemBooked) System.out.println("Lower berth given!");
                Integer tktNum = railwayManagement.getTicketNumber("L");
                Ticket tkt = new Ticket(birthPref);
                tkt.setNumber(tktNum);
                tkt.setAlotted("L");
                p.setTicket(tkt);
                booker.bookTicket(p,"L");
                railwayManagement.decreaseAvailableTicket("L");
            }
            if(birthPref.equals(BerthPreference.M)){
                if(!isSystemBooked) System.out.println("Middle berth given!");
                Integer tktNum = railwayManagement.getTicketNumber("M");
                Ticket tkt = new Ticket(birthPref);
                tkt.setNumber(tktNum);
                tkt.setAlotted("M");
                p.setTicket(tkt);
                booker.bookTicket(p,"M");
                railwayManagement.decreaseAvailableTicket("M");
            }
            if(birthPref.equals(BerthPreference.U)){
                if(!isSystemBooked)  System.out.println("Upper berth given!");
                Integer tktNum = railwayManagement.getTicketNumber("U");
                Ticket tkt = new Ticket(birthPref);
                tkt.setNumber(tktNum);
                tkt.setAlotted("U");
                p.setTicket(tkt);
                booker.bookTicket(p,"U");
                railwayManagement.decreaseAvailableTicket("U");
            }
        }
        else if(railwayManagement.getAvailableTickets("L") > 0){
            if(!isSystemBooked) System.out.println(birthPref +" is full!."+"Lower berth given!");
            Integer tktNum = railwayManagement.getTicketNumber("L");
            Ticket tkt = new Ticket(birthPref);
            tkt.setNumber(tktNum);
            tkt.setAlotted("L");
            p.setTicket(tkt);
            booker.bookTicket(p,"L");
            railwayManagement.decreaseAvailableTicket("L");
        }
        else if(railwayManagement.getAvailableTickets("M") > 0){
            if(!isSystemBooked) System.out.println(birthPref +" is full!."+"Middle berth given!");
            Integer tktNum = railwayManagement.getTicketNumber("M");
            Ticket tkt = new Ticket(birthPref);
            tkt.setNumber(tktNum);
            tkt.setAlotted("M");
            p.setTicket(tkt);
            booker.bookTicket(p,"M");
            railwayManagement.decreaseAvailableTicket("M");
        }
        else if(railwayManagement.getAvailableTickets("U") > 0){
            if(!isSystemBooked) System.out.println(birthPref +" is full!."+"Upper berth given!");
            Integer tktNum = railwayManagement.getTicketNumber("U");
            Ticket tkt = new Ticket(birthPref);
            tkt.setNumber(tktNum);
            tkt.setAlotted("U");
            p.setTicket(tkt);
            booker.bookTicket(p,"U");
            railwayManagement.decreaseAvailableTicket("U");
        }
        else if(railwayManagement.getAvailableTickets("RAC") > 0){
            if(!isSystemBooked) System.out.println(birthPref +" is full!."+"Rac given!");
            Integer tktNum = railwayManagement.getTicketNumber("RAC");
            Ticket tkt = new Ticket(birthPref);
            tkt.setNumber(tktNum);
            tkt.setAlotted("RAC");
            p.setTicket(tkt);
            booker.bookTicket(p,"RAC");
            railwayManagement.decreaseAvailableTicket("RAC");
        }
        else if(railwayManagement.getAvailableTickets("WL") >0){
            if(!isSystemBooked) System.out.println(birthPref +" is full!."+"Added to waiting list!");
            Integer tktNum = railwayManagement.getTicketNumber("WL");
            Ticket tkt = new Ticket(birthPref);
            tkt.setNumber(tktNum);
            tkt.setAlotted("WL");
            p.setTicket(tkt);
            booker.bookTicket(p,"WL");
            railwayManagement.decreaseAvailableTicket("WL");
        }
    }
}
