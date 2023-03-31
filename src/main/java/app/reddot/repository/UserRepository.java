package app.reddot.repository;

import app.reddot.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> { //JpaRepository is to handle database operations
    AppUser findByUsername(String username);
}
