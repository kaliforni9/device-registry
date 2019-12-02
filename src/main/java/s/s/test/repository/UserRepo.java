package s.s.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import s.s.test.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
