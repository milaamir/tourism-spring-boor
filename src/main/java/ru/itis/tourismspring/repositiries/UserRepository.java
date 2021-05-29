package ru.itis.tourismspring.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.tourismspring.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
