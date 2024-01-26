package Node;

public class NodeAdmin {
    String UsernameAdmin;
    String PasswordAdmin;

    public NodeAdmin(String UsernameAdmin, String PasswordAdmin){
        this.UsernameAdmin = UsernameAdmin;
        this.PasswordAdmin = PasswordAdmin;
    }

    public String getUsernameAdmin(){
        return UsernameAdmin;
    }

    public boolean CheckPasswordAdmin(String passwordAdmin){
        return this.PasswordAdmin.equals(passwordAdmin);
    }

    public void viewUserAdmin(){
        System.out.println("Username : "+UsernameAdmin);
        System.out.println("Username : "+PasswordAdmin);
    }
}
