import java.util.Scanner;
import options.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OptionsBuilder optionsBuilder = OptionsBuilder.getInstance();
        while(true){
            System.out.println(" 1.Book\n 2.Cancel\n 3.Print booked tickets\n 4.Print available tickets\n 5.close");
            System.out.println("Enter the choice number you want!");
            int choice = input.nextInt();
            if(choice>=5 || choice< 1){
                break;
            }
            optionsBuilder.runOption(choice-1);
        }
    }
}