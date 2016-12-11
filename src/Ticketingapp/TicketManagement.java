/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketingapp;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

public class TicketManagement {

    List<Ticketing> IssuedTickets = new ArrayList<Ticketing>();

    public void IssueTicket(Ticketing ticketing) {
        ticketing.ticketId = ticketing.generateTicketId();

        IssuedTickets.add(ticketing);
    }

    public List<Ticketing> IssuedTickets() {
        return IssuedTickets;
    }

}
