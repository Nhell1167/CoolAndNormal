public class MemberProfile {
    private FitnessSpecialization fitnessGoal;
    private DemographicMetrics demographicMetrics;


    public MemberProfile(FitnessSpecialization fitnessGoal, DemographicMetrics demographicMetrics) {
        this.fitnessGoal = fitnessGoal;
        this.demographicMetrics = demographicMetrics;
    }

    public FitnessSpecialization getFitnessGoal() {
        return fitnessGoal;
    }

    public DemographicMetrics getDemographicMetrics() {
        return demographicMetrics;
    }
}
