package com.example.pack_ooredoo.DAO.Repositories;

import com.example.pack_ooredoo.DAO.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
