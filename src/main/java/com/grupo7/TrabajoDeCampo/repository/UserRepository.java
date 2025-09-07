package com.grupo7.TrabajoDeCampo.repository;

import com.grupo7.TrabajoDeCampo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

