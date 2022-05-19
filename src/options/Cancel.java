package options;

import helper.CancelHelper;

import java.util.Scanner;

public class Cancel implements Options{
    Scanner input = new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("Enter your passenger id");
        Integer passengerId = input.nextInt();
        CancelHelper.cancelBooking(passengerId);
    }
}
