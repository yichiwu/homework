package com.train

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var tickets = scanner.nextInt()
    while (tickets != -1) {
        print("How many round-trip tickets: ")
        var roundTripTickets = scanner.nextInt()

        val ticket = TicketKotlin(tickets, roundTripTickets)
        ticket.print()

        print("Please enter number of tickets: ")
        tickets = scanner.nextInt()
    }
}

class TicketKotlin(var tickets: Int, var roundTripTickets: Int){
    fun print(){
        println("Total tickets: " + tickets)
        println("Round-trip: " + roundTripTickets)
        println("Total: " + ((tickets-roundTripTickets)*1000 + roundTripTickets*2000*0.9))
    }
}