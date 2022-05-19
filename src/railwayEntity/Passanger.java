package railwayEntity;
import enumeration.Gender;
public class Passanger {
    private final String name;
    private final Integer age;
    private final Gender gender;
    private int childId=-1;
    private Ticket ticket;
    public Passanger(String name  , Integer age ,  Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setChild(int id){
        this.childId = id;
    }

    public int getChildId(){
        return this.childId;
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public Ticket getTicket(){
        return this.ticket;
    }

    public int getAge(){
        return this.age;
    }

    public  String toString(){
        return "\nname: "+this.name+"\nage: "+this.age+"\ngender: "
                +this.gender+"\nchild_id: "+this.childId+"\nTicket: "+this.ticket+"\n";
    }
}
