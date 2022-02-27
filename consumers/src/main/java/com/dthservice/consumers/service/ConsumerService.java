package com.dthservice.consumers.service;

import com.dthservice.consumers.entity.Consumer;
import com.dthservice.consumers.exception.BadConsumerException;

public interface ConsumerService {

    boolean existsById(Long custId) throws BadConsumerException;
    Consumer getById(Long id) throws BadConsumerException;
    Consumer add(Consumer consumer) throws  BadConsumerException;
}
