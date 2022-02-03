package com.nokavietnam.springsecuritydocker.repo;

import com.nokavietnam.springsecuritydocker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @created : 2/3/2022, Thursday
 **/
public interface UserRepo extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
