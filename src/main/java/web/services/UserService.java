package web.services;

import web.model.Role;
import web.model.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    List<User> getAllUsers();

    User getUser(long id);

    void deleteUser(long id);

    void saveUser(User user);

    User updateUser(User user);

    User findByUserName(String name);
}
