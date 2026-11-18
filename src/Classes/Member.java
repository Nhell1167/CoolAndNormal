public class Member extends User{
    private MemberProfile profile;

    private WorkoutPlan workoutPlan;
    private MembershipPlan membershipPlan;

    public Member(UserAccount account, MemberProfile profile, WorkoutPlan workoutPlan, MembershipPlan membershipPlan) {
        super(account);
        this.profile = profile;
        this.workoutPlan = workoutPlan;
        this.membershipPlan = membershipPlan;
    }

    public MemberProfile getProfile() {
        return profile;
    }

    public WorkoutPlan getWorkoutPlan() {
        return workoutPlan;
    }

    public MembershipPlan getMembershipPlan() {
        return membershipPlan;
    }

    @Override
    public void displayDashboard(){

    }
}
