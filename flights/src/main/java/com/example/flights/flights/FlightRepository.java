package com.example.flights.flights;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class FlightRepository {
    List<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        flights.add(new Flight("DL123", "New York", "Los Angeles", AirLines.DELTA.name(), 300.00));
        flights.add(new Flight("AA456", "Chicago", "Miami", AirLines.AMERICAN_AIRLINES.name(), 200.00));
        flights.add(new Flight("UA789", "San Francisco", "Seattle", AirLines.UNITED.name(), 150.00));
        flights.add(new Flight("SW101", "Dallas", "Denver", AirLines.SOUTHWEST.name(), 180.00));
        flights.add(new Flight("JB202", "Boston", "Orlando", AirLines.JETBLUE.name(), 220.00));
        flights.add(new Flight("AS303", "Seattle", "San Diego", AirLines.ALASKA.name(), 250.00));
        flights.add(new Flight("SP404", "Fort Lauderdale", "Las Vegas", AirLines.SPIRIT.name(), 120.00));
        flights.add(new Flight("FR505", "Cleveland", "Phoenix", AirLines.FRONTIER.name(), 160.00));
    }

    public List<Flight> getAllFlights() {
        return flights;
    }

    public Flight getFlightByNumber(String flightNumber) {
        return flights.stream()
                .filter(flight -> flight.getFlightNumber().equalsIgnoreCase(flightNumber))
                .findFirst()
                .orElse(null);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void deleteFlight(String flightNumber) {
        flights.removeIf(flight -> flight.getFlightNumber().equalsIgnoreCase(flightNumber));
    }

    public void updateFlight(String flightNumber, Flight updatedFlight) {
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getFlightNumber().equalsIgnoreCase(flightNumber)) {
                flights.set(i, updatedFlight);
                return;
            }
        }
    }
}
