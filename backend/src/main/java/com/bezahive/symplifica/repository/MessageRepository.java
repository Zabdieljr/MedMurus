package com.bezahive.symplifica.repository;

import org.aspectj.bridge.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message,Long> {
}
