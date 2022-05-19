package railwayEntity.berth;

import railwayEntity.Berth;

public class BirthFactory {
    public Berth getBirthInstance(String option){
        Berth berth=null;
        if(option.equals("L")){
            return LowerBerth.getInstance();
        }
        if(option.equals("M")){
            return MiddleBerth.getInstance();
        }
        if(option.equals("U")){
            return UpperBerth.getInstance();
        }
        if(option.equals("RAC")){
            return  Rac.getInstance();
        }
        if(option.equals("WL")){
            return  WaitingList.getInstance();
        }
        return  berth;
    }
}
