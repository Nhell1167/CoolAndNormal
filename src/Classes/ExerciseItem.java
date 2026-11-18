public class ExerciseItem {
    private String exerciseName, notes;
    private int targetSets, targetReps, restTimeSeconds;

    public ExerciseItem(String exerciseName, String notes, int targetSets, int targetReps, int restTimeSeconds) {
        this.exerciseName = exerciseName;
        this.notes = notes;
        this.targetSets = targetSets;
        this.targetReps = targetReps;
        this.restTimeSeconds = restTimeSeconds;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public String getNotes() {
        return notes;
    }

    public int getTargetSets() {
        return targetSets;
    }

    public int getTargetReps() {
        return targetReps;
    }

    public int getRestTimeSeconds() {
        return restTimeSeconds;
    }
    public void updatePrescription(){

    }
    public String toString(){
        return notes;
    }
}
