package hanuman.repository;

import hanuman.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add a custom method to find by username
    User findByUsername(String username);
}
