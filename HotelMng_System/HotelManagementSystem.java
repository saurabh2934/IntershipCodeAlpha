package HotelMng_System;

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        // Create an array of rooms
        Room[] rooms = {
                new Room(101),
                new Room(102),
                new Room(103),
                new Room(201),
                new Room(202),
                new Room(203),
        };
        // Create a hotel object
        Hotel hotel = new Hotel("Grand Hotel", rooms);
        Scanner scanner = new Scanner(System.in);
        // Display menu and handle user input
        while (true) {
            System.out.println("\n--- Hotel Management System by DataFlair ---");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. View available rooms");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hotel.checkIn();
                    break;
                case 2:
                    hotel.checkOut();
                    break;
                case 3:
                    hotel.displayAvailableRooms();
                    break;
                case 4:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}