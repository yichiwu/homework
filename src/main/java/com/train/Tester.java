package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number of tickets: ");
        int tickets = scanner.nextInt();
        while (tickets != -1) {

            System.out.print("How many round-trip tickets: ");
            int roundTripTickets = scanner.nextInt();

            Ticket tic = new Ticket(tickets, roundTripTickets);
            tic.print();

            System.out.print("Please enter number of tickets: ");
            tickets = scanner.nextInt();
        }
    }
}
