package railwayEntity;

public interface Berth {
    public  int getAvailableTickets();
    public void increaseAvailableTicket();
    public void decreaseAvailableTicket();
    public int getTicketNumber();
    public void addTicketNumber(int no);
    public void addToPassengersList(int passengerId);
    public int passengerListSize();
    public void removeFromPassengerList(int id);
    public int getPassenger();
}
