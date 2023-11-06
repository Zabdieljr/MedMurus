package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.Meta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// add repository annotation
@Repository
// add extends CrudRepository <Entity, Long>

public interface MetaRepository extends CrudRepository<Meta, Long> {
    // add method to find by groupid
    Meta findByGroupid(String groupid);
    // add method to find by metaKey
    Meta findByMetaKey(String metaKey);


}
