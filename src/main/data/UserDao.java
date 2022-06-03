package main.data;

import main.entities.User;

import java.util.ArrayList;

public class UserDao {
    private final static ArrayList<User> userList = new ArrayList<User>();

    public static void addUser(User user) {
        userList.add(user);
    };

    public static int getCountOfUsers() {
        return userList.size();
    };

    public static boolean userIsExist(User user) {
        boolean result = false;
        for(User _user: userList){
            if(_user.getUsername().equals(user.getUsername()) && _user.getPassword().equals(user.getPassword())){
            result = true;
            break;
            }
        }
        return result;
    }
}
