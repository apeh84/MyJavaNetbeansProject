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
public class TicketPricing implements Pricing {

    public double routePrice(Route route) {

        if (route.bus.distance < 100) {
            return route.bus.distance * 0.060;
        } else if (route.bus.distance > 100 && route.bus.distance < 300) {
            return route.bus.distance * 0.067;
        } else if (route.bus.distance > 300 && route.bus.distance < 600) {
            return route.bus.distance * 0.071;
        } else {
            return route.bus.distance * 0.074;
        }
    }

    public double returnPrice(double price) {
        return price * 1.47;
    }

    public double studentDiscount(double price) {
        return price - price * 0.19;
    }


}
