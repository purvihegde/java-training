package com.example.learnspringboot.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingService {
    private Cohort cohort;

    @Autowired
    public void setCohort(Cohort cohort) {
        this.cohort = cohort;
    }

    public Cohort getCohort() {
        return cohort;
    }

    public void showDetails() {
        this.cohort.getDetails();
    }
}
