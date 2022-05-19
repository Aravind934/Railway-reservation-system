package helper;

import railwayEntity.Passanger;
import railwayEntity.RailwayManagement;

public class Booker {
    RailwayManagement railwayManagement = new RailwayManagement();
    public  void bookTicket(Passanger p ,String type){
        railwayManagement.addToPassengers(p.getTicket().getPassengerId(), p);
        railwayManagement.addToPassengerList(p.getTicket().getPassengerId() , type);
    }
}
