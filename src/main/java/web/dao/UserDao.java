package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(long id);

    void deleteUser(long id);

    void saveUser(String name, String lastName, String email);

    User updateUser(User user);
}
