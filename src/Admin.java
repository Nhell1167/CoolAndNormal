import java.util.List;

public class Admin extends User{
    private List<Trainer> employedTrainers;
    private List<Member> enrolledMembers;

    public Admin(UserAccount account, List<Trainer> employedTrainers, List<Member> enrolledMembers) {
        super(account);
        this.employedTrainers = employedTrainers;
        this.enrolledMembers = enrolledMembers;
    }

    public List<Trainer> getEmployedTrainers() {
        return employedTrainers;
    }

    public List<Member> getEnrolledMembers() {
        return enrolledMembers;
    }
    public void addMember(Member member){

    }
    public void addTrainer(Trainer trainer){

    }

    @Override
    public void displayDashboard() {

    }
}
