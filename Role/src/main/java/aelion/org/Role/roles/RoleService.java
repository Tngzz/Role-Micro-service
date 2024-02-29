package aelion.org.Role.roles;

import org.springframework.http.ResponseEntity;


public interface RoleService {
    ResponseEntity<?> createRole(Role role);
    ResponseEntity<?> fetchRoles();
}
