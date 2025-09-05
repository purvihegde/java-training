package com.example.flights.flights;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    FlightRepository flightRepository;

    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @GetMapping("/")
    public List<Flight> getAllFlights() {
        return flightRepository.getAllFlights();
    }

    @GetMapping("/{flightNumber}")
    public Flight getFlightByNumber(@PathVariable String flightNumber) {
        return flightRepository.getFlightByNumber(flightNumber);
    }

    @PostMapping("/add")
    public void addFlight(@RequestBody Flight flight) {
        flightRepository.addFlight(flight);
    }
}
