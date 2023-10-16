package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.GroupMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMessageRepository extends CrudRepository<GroupMessage,Long> {
}
