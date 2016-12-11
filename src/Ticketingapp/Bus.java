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
public class Bus {

    String departureCity;
    String arrivalCity;
    double distance;

    public Bus(String departureCity, String arrivalCity, double distance) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.distance = distance;
    }

}
