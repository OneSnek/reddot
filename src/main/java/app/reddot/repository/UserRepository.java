package app.reddot.repository;

import app.reddot.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<AppUser, Long> { //JpaRepository is to handle database operations
    AppUser findByUsername(String username);
}
