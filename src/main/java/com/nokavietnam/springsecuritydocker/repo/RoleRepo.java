package com.nokavietnam.springsecuritydocker.repo;

import com.nokavietnam.springsecuritydocker.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @created : 2/3/2022, Thursday
 **/
public interface RoleRepo extends JpaRepository<Role, Long> {
  Role findByName(String name);
}
