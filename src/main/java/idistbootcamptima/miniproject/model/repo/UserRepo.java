package idistbootcamptima.miniproject.model.repo;

import idistbootcamptima.miniproject.model.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
