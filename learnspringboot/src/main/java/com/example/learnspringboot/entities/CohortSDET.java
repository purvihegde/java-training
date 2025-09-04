package com.example.learnspringboot.entities;

import org.springframework.stereotype.Component;

@Component
public class CohortSDET implements Cohort {
    @Override
    public void getDetails() {
        System.out.println("This is the SDET Cohort");
    }
}
