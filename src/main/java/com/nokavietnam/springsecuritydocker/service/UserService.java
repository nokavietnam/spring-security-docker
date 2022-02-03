package com.nokavietnam.springsecuritydocker.service;

import com.nokavietnam.springsecuritydocker.entity.Role;
import com.nokavietnam.springsecuritydocker.entity.User;
import java.util.List;

/**
 * @created : 2/3/2022, Thursday
 **/
public interface UserService {
  User saveUser(User user);
  Role saveRole(Role role);
  void addRoleToUser(String username, String roleName);
  User getUser(String username);
  List<User> getUsers();
}
