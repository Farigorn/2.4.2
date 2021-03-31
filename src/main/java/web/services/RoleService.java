package web.services;

import web.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Role getRole(long id);

    List<Role> getAllRole();

    Set<Role> addOrUpdateRole(long id);
}
