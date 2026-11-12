import java.util.List;

public class WorkoutPlan {
    private String planId, title;
    private FitnessSpecialization goal;
    private List<DailyRoutine> routines;

    public WorkoutPlan(String planId, String title, FitnessSpecialization goal, List<DailyRoutine> routines) {
        this.planId = planId;
        this.title = title;
        this.goal = goal;
        this.routines = routines;
    }

    public String getPlanId() {
        return planId;
    }

    public String getTitle() {
        return title;
    }

    public FitnessSpecialization getGoal() {
        return goal;
    }

    public List<DailyRoutine> getRoutines() {
        return routines;
    }
    public void addRoutine(DailyRoutine routine){

    }
    public void removeRoutine(DailyRoutine routine){

    }
    public DailyRoutine getTodaysRoutine(){
        return null;
    }
}
