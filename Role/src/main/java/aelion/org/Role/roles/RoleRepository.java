package aelion.org.Role.roles;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import aelion.org.Role.roles.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> {
}
