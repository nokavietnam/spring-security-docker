package com.nokavietnam.springsecuritydocker;

import com.nokavietnam.springsecuritydocker.entity.Role;
import com.nokavietnam.springsecuritydocker.entity.User;
import com.nokavietnam.springsecuritydocker.service.UserService;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityDockerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringSecurityDockerApplication.class, args);
  }

  @Bean
  BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

//  @Bean
//  CommandLineRunner run(UserService userService) {
//    return args -> {
//      userService.saveRole(new Role(null, "ROLE_USER"));
//      userService.saveRole(new Role(null, "ROLE_MANAGER"));
//      userService.saveRole(new Role(null, "ROLE_ADMIN"));
//      userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//      userService.saveUser(new User(null, "Join Travolta", "join", "1234", new ArrayList<>()));
//      userService.saveUser(new User(null, "Smith", "will", "1234", new ArrayList<>()));
//      userService.saveUser(new User(null, "Jim", "jim", "1234", new ArrayList<>()));
//      userService.saveUser(new User(null, "Arnold", "arnold", "1234", new ArrayList<>()));
//
//      userService.addRoleToUser("join", "ROLE_USER");
//      userService.addRoleToUser("join", "ROLE_MANAGER");
//      userService.addRoleToUser("will", "ROLE_MANAGER");
//      userService.addRoleToUser("jim", "ROLE_ADMIN");
//      userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
//      userService.addRoleToUser("arnold", "ROLE_ADMIN");
//      userService.addRoleToUser("arnold", "ROLE_USER");
//    };
//  }
}
