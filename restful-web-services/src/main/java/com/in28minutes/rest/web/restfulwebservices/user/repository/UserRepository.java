package com.in28minutes.rest.web.restfulwebservices.user.repository;

import com.in28minutes.rest.web.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
