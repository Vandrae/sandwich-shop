package com.pluralsight;

import java.util.Scanner;

public class PontOfSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //------------------User Interactions------------------
        System.out.print("What size sandwich do you want Regular(1) or Large(2): ");
        int sandwichSize = input.nextInt();
        System.out.print("How old are you? ");
        int age = input.nextInt();
        double price = 0;

        //determines price based on sandwich size
        if (sandwichSize == 1) {
            price = 5.45;
        } else if (sandwichSize == 2) {
            price = 8.95;
        }

        // provides discounts based on age
        if (age <= 17){
            price = price * .9;
        } else if (age >= 65 ) {
            price = price * .8;
        }

        //Prints price using above if statement changes
        System.out.printf("Your total is $"  + "%.2f", price);

    }
}
