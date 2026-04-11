package com.pluralsight;

import java.util.Scanner;

public class PontOfSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //------------------User Interactions------------------
        System.out.print("What size sandwich do you want Regular(1) or Large(2): ");
        int sandwichSize = input.nextInt();
        System.out.print("Do you want your sandwich loaded?: Yes(1) or No(2) ");
        int loadedSandwich = input.nextInt();
        System.out.print("How old are you? ");
        int age = input.nextInt();
        double price = 0;

        //determines price based on sandwich size and if they want it loaded or not
        if (sandwichSize == 1) {
            price = 5.45;
            if (loadedSandwich == 1){
                price = price + 1.00;
            }
        } else if (sandwichSize == 2) {
            price = 8.95;
            if (loadedSandwich == 1){
                price = price + 1.75;
            }
        }

        // provides discounts based on age
        if (age <= 17){
            price = price * .9;
        } else if (age >= 65 ) {
            price = price * .8;
        }

        //Prints price using above if statement changes
        System.out.printf("Your total is $"  + "%.2f", price);

        // id want to add else statements to catch if someone put in a 3 for example
        // but was unable to catch that until after it ran through all the options first
        // might need a loop for that to done effectively

    }
}
