package school.hei.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
