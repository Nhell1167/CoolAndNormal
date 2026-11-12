import java.util.List;

public class Trainer extends User {
    private FitnessSpecialization fitnessSpecialization;
    private List<Member> clients;

    public Trainer(UserAccount account, FitnessSpecialization fitnessSpecialization, List<Member> clients) {
        super(account);
        this.fitnessSpecialization = fitnessSpecialization;
        this.clients = clients;
    }

    public FitnessSpecialization getFitnessSpecialization() {
        return fitnessSpecialization;
    }

    public List<Member> getClients() {
        return clients;
    }

    public WorkoutPlan createWorkoutPlan(){
        return null;
    }
    public void assignWorkoutPlan(WorkoutPlan workout, Member member){

    }

    @Override
    public void displayDashboard() {

    }
}
