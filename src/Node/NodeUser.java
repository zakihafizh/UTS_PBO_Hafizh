// NodeUser.java
package Node;

public class NodeUser {
    String Username;
    String Password;

    public NodeUser(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername(){
        return Username;
    }

    public boolean CheckPassword(String password){
        return this.Password.equals(password);
    }

    public void viewUser(){
        System.out.println("Username : "+Username);
        System.out.println("Username : "+Password);
    }
}
