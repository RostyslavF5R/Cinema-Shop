package cinema.shop.util;

import cinema.shop.model.Role;
import cinema.shop.model.RoleName;
import cinema.shop.model.User;
import cinema.shop.service.RoleService;
import cinema.shop.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(RoleName.USER);
        roleService.add(userRole);

        User admin = new User();
        admin.setRoles(Set.of(adminRole));
        admin.setEmail("bob@gmail.com");
        admin.setPassword("12345678");
        userService.add(admin);

        User user = new User();
        user.setRoles(Set.of(userRole));
        user.setEmail("user@gmail.com");
        user.setPassword("87654321");
        userService.add(user);
    }
}
