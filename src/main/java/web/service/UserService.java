package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void removeUser(User user);


    void updateUser(User user);

    List<User> allUsers();
    User getUserById(Long id);
}
