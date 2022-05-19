package railwayEntity;
import railwayEntity.berth.*;

import java.util.*;
public class RailwayManagement {
    private static int id=1;
    private static HashMap<Integer ,Passanger> passengers = new HashMap<>();
    public void addToPassengers(int passengerId , Passanger p){
        passengers.put(passengerId , p);
    }
    public void removeFromPassengers(int passengerId){
        passengers.remove(passengerId);
    }
    public int getPassengerId(){
        return id++;
    }
    public ArrayList<Integer> getBookedPassengersList(){
        return ParentBerth.getPassengerList();
    }
    public Passanger getPassenger(int passengerId){
        return passengers.get(passengerId);
    }
    public  Boolean containsPassenger(int passengerId){
        return ParentBerth.containsPassebger(passengerId);
    }
    BirthFactory birthFactory = new BirthFactory();
    public int getAvailableTickets(String option){
        Berth berth = birthFactory.getBirthInstance(option);
        return berth.getAvailableTickets();
    }

    public int getTicketNumber(String option){
        Berth berth = birthFactory.getBirthInstance(option);
        return berth.getTicketNumber();
    }

    public void decreaseAvailableTicket(String option){
        System.out.println(LowerBerth.availableTickets+" >>> L");
        Berth berth = birthFactory.getBirthInstance(option);
        berth.decreaseAvailableTicket();
        System.out.println(LowerBerth.availableTickets+" >> L");
    }

    public void addToPassengerList(int passengerId , String option){
        Berth berth = birthFactory.getBirthInstance(option);
        berth.addToPassengersList(passengerId);
    }

    public void increaseAvailableTicket(String option){
        Berth berth = birthFactory.getBirthInstance(option);
        berth.increaseAvailableTicket();
    }

    public void addTicketNumber(String option , int number){
        Berth berth = birthFactory.getBirthInstance(option);
        berth.addTicketNumber(number);
    }

    public void removeFromPassengerList(int passengerId , String option){
        Berth berth = birthFactory.getBirthInstance(option);
        berth.removeFromPassengerList(passengerId);
    }

    public int getPassengerListSize(String option){
        Berth berth = birthFactory.getBirthInstance(option);
        return berth.passengerListSize();
    }

    public Passanger getPassengerFromList(String option){
        Berth berth = birthFactory.getBirthInstance(option);
        int id = berth.getPassenger();
        if(id>=0){
            return passengers.get(id);
        }
        return null;
    }
}
