package com.train;

public class Ticket {
    int tickets;
    int roundTripTickets;

    public Ticket(int tickets, int roundTripTickets) {
        this.tickets = tickets;
        this.roundTripTickets = roundTripTickets;
    }

    public void print(){
        System.out.println("Total tickets: " + tickets);
        System.out.println("Round-trip: " + roundTripTickets);
        System.out.println("Total: " + ((tickets-roundTripTickets)*1000 + roundTripTickets*2000*0.9));
    }
}
