public class UserAccount {
    protected String userId;
    private String fullName, email, password;
    public UserAccount(String userId, String fullName, String email, String password){
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }
    public String getUserId(){
        return userId;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void displayDashboard(){

    }
}
