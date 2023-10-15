package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.User_Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPostRepository extends CrudRepository<User_Post,Long> {

}
