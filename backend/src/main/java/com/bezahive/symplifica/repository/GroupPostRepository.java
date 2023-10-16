package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.GroupPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupPostRepository extends CrudRepository<GroupPost,Long> {
}
