package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends CrudRepository<Friend,Long> {
}
