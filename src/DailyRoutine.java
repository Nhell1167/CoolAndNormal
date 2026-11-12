import java.util.List;

public class DailyRoutine {
    private String routineId, dayName;
    private List<ExerciseItem> exercises;

    public DailyRoutine(String routineId, String dayName, List<ExerciseItem> exercises) {
        this.routineId = routineId;
        this.dayName = dayName;
        this.exercises = exercises;
    }

    public String getRoutineId() {
        return routineId;
    }

    public String getDayName() {
        return dayName;
    }

    public List<ExerciseItem> getExercises() {
        return exercises;
    }
    public void addExercise(){

    }
    public void removeExercise(){

    }
    public void getSummary(){

    }
}
