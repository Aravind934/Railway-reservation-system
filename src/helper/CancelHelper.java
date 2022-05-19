package helper;

import railwayEntity.RailwayManagement;

public class CancelHelper {
    public static  void cancelBooking(Integer pasengerId){
        Canceller canceller = new Canceller();
        RailwayManagement railwayManagement = new RailwayManagement();
        if(!railwayManagement.containsPassenger(pasengerId)){
            System.out.println("passenger id not found.");
        }
        else {
            canceller.cancelBooking(pasengerId);
            System.out.println("Cancelled successfully!");
        }
    }

}
