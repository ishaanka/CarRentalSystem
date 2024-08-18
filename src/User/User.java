package User;

public class User extends IUser {
    public User(String userName, String password, String name, String dlNumber) {
        this.dlNumber = dlNumber;
        this.userName = userName;
        this.password = password;
        this.name = name;
    }
}
