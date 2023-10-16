package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.GroupFollower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupFollowerRepository extends CrudRepository<GroupFollower,Long> {
}
