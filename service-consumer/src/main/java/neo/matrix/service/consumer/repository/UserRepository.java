package neo.matrix.service.consumer.repository;

import neo.matrix.service.consumer.dto.User;
import neo.matrix.service.consumer.dto.UserNameAndPassword;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

   List<User> findAllByUsernameEquals(String name);

   List<UserNameAndPassword> findByAccountNonExpired();
}
