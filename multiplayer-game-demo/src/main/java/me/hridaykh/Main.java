package me.hridaykh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("client(c)/server(s): ");

    String Class = scanner.nextLine();  // Read user input
    switch (Class) {
        case "c":
            System.out.println("Client:\n");
            new me.hridaykh.multiplayer_system.client().run();
            System.out.println("\nClient Stopped.");
            break;
        case "s":
            System.out.println("Server:\n");
            new me.hridaykh.multiplayer_system.server().run();
            System.out.println("\nServer Stopped.");
            break;
            case "g":
                System.out.println("Game:\n");
                new me.hridaykh.game.gameMain().run();
                System.out.println("\ngame Stopped.");
                break;
        default:
            System.out.println("Invalid input: " + Class);
            break;
    }

    scanner.close();  // Close the scanner

    }
}