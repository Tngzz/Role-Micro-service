package aelion.org.Role.roles;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Role {
    @Id
    private String id;

    private String name;
}
