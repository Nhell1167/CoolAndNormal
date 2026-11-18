public class OnboardingManager {
    public UserAccount createUserAccount(String name, String email,String pass){
        String id = ""; //generate id
        return new UserAccount(id,name,email,pass);
    }
}
