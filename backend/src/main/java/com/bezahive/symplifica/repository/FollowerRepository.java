package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.Follower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowerRepository extends CrudRepository<Follower,Long> {



}
