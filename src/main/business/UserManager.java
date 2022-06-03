package main.business;

import main.entities.User;
import main.data.UserDao;

public class UserManager implements UserService {


    public UserManager(){

    };

    public void Register(User user) {
        UserDao.addUser(user);
    };

    public boolean Login(User user) {
        return this.userIsExist(user);
    }

    public boolean userIsExist(User user) {
        return UserDao.userIsExist(user);
    }

    public int getCountOfUsers() {
        return UserDao.getCountOfUsers();
    }
}
