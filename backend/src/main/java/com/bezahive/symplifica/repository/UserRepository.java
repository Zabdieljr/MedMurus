package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
    User findByEmail(String email);
   }
