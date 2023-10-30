package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends CrudRepository<Group,Long> {


  }
