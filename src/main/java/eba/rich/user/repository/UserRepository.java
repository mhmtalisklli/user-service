package eba.rich.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import eba.rich.user.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    
    Optional<User> findByTckn(String tckn);
}