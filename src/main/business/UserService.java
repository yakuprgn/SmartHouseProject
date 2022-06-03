package main.business;

import main.entities.User;

public interface UserService {
    void Register(User user);
    boolean Login(User user);
    boolean userIsExist(User user);
    int getCountOfUsers();
}
