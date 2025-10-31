package overloadedConstructor;

public class User {
    String username;
    String email;

    User(String username){
        this.username = username;
        this.email = "Yakitori@gmail.com";
    }

    User(String username, String email){
        this.username = username;
        this.email = email;
    }
}
