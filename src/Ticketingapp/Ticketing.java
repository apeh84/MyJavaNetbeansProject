/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketingapp;

/**
 *
 * @author Gabriel
 */
import java.util.List;

public class Ticketing {

    int ticketId;
    Person person;
    int route;
    boolean oneWay;
    double price;

    public Ticketing(Person person, int route, boolean oneWay, double price) {
        this.person = person;
        this.route = route;
        this.oneWay = oneWay;
        this.price = price;
    }

    TicketManagement tm = new TicketManagement();
    List<Ticketing> isTicket = tm.IssuedTickets();

    public int generateTicketId() {
        // To generate a random number from 1000 to 6000
        int id = 1000 + (int) (Math.random() * 5000);

        for (Ticketing t : isTicket) {
            if (t.ticketId == id) {
                generateTicketId();
            }
        }

        return id;
    }

}
