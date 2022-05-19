package railwayEntity.berth;
import java.util.ArrayList;
public class ParentBerth {
    private static ArrayList<Integer> passengersList = new ArrayList<>();
    public void addToPassengersList(int passengerId){
        passengersList.add(passengerId);
    }

    public int passengerListSize(){
        return passengersList.size();
    }

    public void removeFromPassengerList(int id) {
        passengersList.remove((Object)id);
    }
    public static ArrayList<Integer> getPassengerList() {
        return passengersList ;
    }

    public static Boolean containsPassebger(int id){
        return passengersList.contains(id);
    }

    public int getPassenger(){
        return -1;
    }
}