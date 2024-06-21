public class User {
    String username;
    String password;
    String phoneNumber;
    String email;
    Boolean admin = false;
    final String country = "Indonesia";

    void userMe() throws Exception {
        System.out.println("My username is"+ this.username+
        " password "+ this.password+
        "phoneNumber "+ this.phoneNumber+
        " email "+ this.email+
        (this.admin? " is_admin ": "")+
        " country "+ this.country
        );
    }

    void login(String username, String password) {
        if (this.username == username && this.password == password) {
            System.out.println("Success login with username "+ username);
        }else {
            System.out.println("Failed login with username "+ username);
        }
    }
   
    User(String username, String password, String phoneNumber, Boolean admin){
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.admin = admin;
    }

    User(String username, String password, String phoneNumber){
        this(username, password, phoneNumber, false);
    }

    User(String username, String password){
        this(username,password, null);
    }

    User(String username){
        this(username,null);

    }

    User(){
        this( null);
    }
}
