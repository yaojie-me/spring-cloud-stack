package neo.matrix.service.sharding.repository;

import neo.matrix.service.sharding.dto.User;
import neo.matrix.service.sharding.dto.UserNameAndPassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


   @Query(value = "select * from ds1.users_db1 union select * from ds2.users_db2 ",nativeQuery = true)
   List<UserNameAndPassword> findBySharding();
}
