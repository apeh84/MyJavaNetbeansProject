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
public interface Pricing {
    public double routePrice(Route route);

    public double returnPrice(double price);

    public double studentDiscount(double price);
}