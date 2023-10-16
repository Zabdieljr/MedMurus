package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.GroupMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMemberRepository extends CrudRepository<GroupMember,Long> {
}
