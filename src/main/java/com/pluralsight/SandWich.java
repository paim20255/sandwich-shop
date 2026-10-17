package com.pluralsight;

import java.util.Scanner;

public class SandWich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a sandwich size: ");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large($8.95)");
        System.out.println("Enter 1 or 2: ");
        int size = Integer.parseInt(input.nextLine());

        // New changes
        System.out.println("Would you like it loaded? (yes/no): ");
        String loadedInput = input.nextLine();
        boolean isLoaded = loadedInput.equalsIgnoreCase("yes");

        double price = 0;
        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        } else {
            System.out.println("Invalid size.");
            return;

        }
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age <= 17) {
            price = price * 0.90f;  // 10% off
        } else if (age >= 65) {
            price = price * 0.80;   // 20% off
        }

        System.out.printf("Your sandwich costs: $%.2f%n", price);
    }
}