package cinema.shop.dao;

import cinema.shop.model.Role;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(String name);
}
