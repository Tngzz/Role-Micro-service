package aelion.org.Role.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api/v1/roles")
public class RoleController {
    @Autowired
    private RoleService service;

    @PostMapping
    public ResponseEntity<?> createRole(@RequestBody Role role) {
        return service.createRole(role);
    }

    @GetMapping
    public ResponseEntity<?> fetchAll(){
        return service.fetchRoles();
    }
}
