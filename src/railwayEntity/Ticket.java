package railwayEntity;
import enumeration.BerthPreference;
public class Ticket {
    private final BerthPreference birthPreference;
    private final  Integer passangerId;
    private  String alotted;
    private  Integer number;

    public Ticket(BerthPreference birthPreference){
        RailwayManagement railwayManagement =new RailwayManagement();
        this.passangerId = railwayManagement.getPassengerId();
        this.birthPreference = birthPreference;
        this.alotted = "";
        this.number =-1;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setAlotted(String alotted){
        this.alotted = alotted;
    }

    public int getNumber(){
        return this.number;
    }

    public BerthPreference getBerthPreference(){
        return this.birthPreference;
    }

    public String getAlotted(){
        return this.alotted;
    }

    public int getPassengerId(){
        return this.passangerId;
    }

    public String toString(){
        return "\nBirth: "+this.birthPreference+"\nPassenger_id: "+this.passangerId+"\nAlotted: "+this.alotted
                +"\nTicket_number: "+this.number;
    }

}
