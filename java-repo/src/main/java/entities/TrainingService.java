package entities;

public class TrainingService {
    private Cohort cohort;

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
