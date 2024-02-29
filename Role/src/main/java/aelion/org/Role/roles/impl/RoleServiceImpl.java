package aelion.org.Role.roles.impl;

import aelion.org.Role.roles.Role;
import aelion.org.Role.roles.RoleRepository;
import aelion.org.Role.roles.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public ResponseEntity<?> createRole(Role role) {
        try {
            return new ResponseEntity<Role>(
                    repository.save(role),
                    HttpStatus.CREATED
            );
        } catch (Exception e) {
            return new ResponseEntity<>("Unable to save Community", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Role>> fetchRoles() {
        List<Role> roles = repository.findAll();
        if (roles.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(roles);
    }
}