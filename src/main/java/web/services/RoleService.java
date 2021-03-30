package web.services;

import web.model.Role;

import java.util.List;

public interface RoleService {
    Role getRole(long id);

    List<Role> getAllRole();
}
