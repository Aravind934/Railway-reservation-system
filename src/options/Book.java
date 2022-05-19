package options;

import enumeration.BerthPreference;
import enumeration.Gender;
import helper.BookingHelper;
import railwayEntity.Passanger;
import railwayEntity.RailwayManagement;

import java.util.Scanner;

public class Book implements Options {
    Scanner input = new Scanner(System.in);
    RailwayManagement railwayManagement = new RailwayManagement();
    public void run(){
        System.out.println("Enter your name!");
        String name = input.next();
        System.out.println("Enter your age!");
        int age = input.nextInt();
        System.out.println("Enter your gender! (M | F)");
        Gender gender = Gender.valueOf(input.next());
        System.out.println("Enter your birth preference! (L | M | U)");
        BerthPreference birthPreference = BerthPreference.valueOf(input.next());
        int flag =0;
        if(gender.equals(Gender.F) && age <60){
            System.out.println("Do you have any children? if yes press 1 or press 0");
            flag = input.nextInt();
        }
        Passanger passanger = new Passanger(name , age , gender);
        if(flag ==1){
            System.out.println("Enter the number of children do you have?");
            int nOfChild = input.nextInt();
            if(nOfChild >1){
                System.out.println("We can't add your child information. please apply another tickets for your children!");
            }
            if(nOfChild==1){
                System.out.println("Enter your child name!");
                String cName = input.next();
                System.out.println("Enter your child gender!");
                Gender cGender = Gender.valueOf(input.next());
                System.out.println("Enter your child age!");
                int cAge = input.nextInt();
                if(cAge >=5){
                    System.out.println("We can't add your child information. please apply another ticket for your children!");
                }
                if(cAge <5){
                    Passanger child = new Passanger(cName,cAge,cGender);
                    int childId = railwayManagement.getPassengerId();
                    railwayManagement.addToPassengers(childId,child);
                    passanger.setChild(childId);
                }
            }
        }
        BookingHelper.bookTicket(passanger , birthPreference ,false);
    }
}
