public class DemographicMetrics {
    private int age;
    private float weght, height;

    public DemographicMetrics(int age, float weght, float height) {
        if(age > 0)
            this.age = age;
        this.weght = weght;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public float getWeght() {
        return weght;
    }

    public float getHeight() {
        return height;
    }
}
