package neo.matrix.service.sharding.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "users")
public class User  {
    @Id()
    private long id;
    private String username;
    private String password;
    private String roles;
    private boolean enable;

}
