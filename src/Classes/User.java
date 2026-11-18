public abstract class User {
    private UserAccount account;
    public User(UserAccount account){
        this.account = account;
    }
    public abstract void displayDashboard();
}
