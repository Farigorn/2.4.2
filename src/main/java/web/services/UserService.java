package web.services;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(long id);

    void deleteUser(long id);

    void saveUser(String name, String lastName, String email);

    User updateUser(User user);
}
