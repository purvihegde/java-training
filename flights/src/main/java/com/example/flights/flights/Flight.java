package com.example.flights.flights;

public class Flight {
    private String flightNumber;
    private String departure;
    private String arrival;
    private String airline;
    private double price;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flight(String flightNumber, String departure, String arrival, String airline, double price) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.airline = airline;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight [flightNumber=" + flightNumber + ", departure=" + departure + ", arrival=" + arrival
                + ", airline=" + airline + ", price=" + price + "]";
    }

}
