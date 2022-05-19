package helper;

import enumeration.BerthPreference;
import railwayEntity.Passanger;
import railwayEntity.RailwayManagement;

public class Canceller {
    RailwayManagement railwayManagement = new RailwayManagement();
    public void cancelBooking(Integer passengerId){
        Passanger p = railwayManagement.getPassenger(passengerId);
        railwayManagement.removeFromPassengers(passengerId);

        if(p.getTicket().getBerthPreference().equals(BerthPreference.L)){
            railwayManagement.increaseAvailableTicket("L");
            railwayManagement.addTicketNumber("L",p.getTicket().getNumber());
            railwayManagement.removeFromPassengerList(passengerId,"L");
        }

        if(p.getTicket().getBerthPreference().equals(BerthPreference.M)){
            railwayManagement.increaseAvailableTicket("M");
            railwayManagement.addTicketNumber("M",p.getTicket().getNumber());
            railwayManagement.removeFromPassengerList(passengerId,"M");
        }

        if(p.getTicket().getBerthPreference().equals(BerthPreference.U)){
            railwayManagement.increaseAvailableTicket("U");
            railwayManagement.addTicketNumber("U",p.getTicket().getNumber());
            railwayManagement.removeFromPassengerList(passengerId,"U");
        }

        if(p.getTicket().getAlotted().equals("RAC")){
            railwayManagement.increaseAvailableTicket("RAC");
            railwayManagement.addTicketNumber("RAC",p.getTicket().getNumber());
            railwayManagement.removeFromPassengerList(passengerId,"RAC");
        }

        if(p.getTicket().getAlotted().equals("WL")){
            railwayManagement.increaseAvailableTicket("WL");
            railwayManagement.addTicketNumber("WL",p.getTicket().getNumber());
            railwayManagement.removeFromPassengerList(passengerId,"WL");
        }

        if(railwayManagement.getPassengerListSize("RAC") > 0){
            Passanger rac = railwayManagement.getPassengerFromList("RAC");
            railwayManagement.increaseAvailableTicket("RAC");
            railwayManagement.addTicketNumber("RAC",rac.getTicket().getNumber());
            if(railwayManagement.getPassengerListSize("WL") > 0){
                Passanger wl = railwayManagement.getPassengerFromList("WL");
                railwayManagement.increaseAvailableTicket("WL");
                railwayManagement.addTicketNumber("WL", wl.getTicket().getNumber());
                wl.getTicket().setNumber(railwayManagement.getTicketNumber("RAC"));
                wl.getTicket().setAlotted("RAC");
                railwayManagement.decreaseAvailableTicket("RAC");
                railwayManagement.addToPassengerList(wl.getTicket().getPassengerId(),"RAC");
            }
            BookingHelper.bookTicket(rac , rac.getTicket().getBerthPreference() , true);
        }
    }

}
