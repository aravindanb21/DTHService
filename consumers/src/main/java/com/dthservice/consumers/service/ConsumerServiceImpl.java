package com.dthservice.consumers.service;

import com.dthservice.consumers.dao.ConsumerDao;
import com.dthservice.consumers.entity.Consumer;
import com.dthservice.consumers.exception.BadConsumerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService{

    @Autowired
    private ConsumerDao consumerDao;

    @Override
    public boolean existsById(Long custId) throws BadConsumerException {
        return consumerDao.existsById(custId);
    }

    @Override
    public Consumer getById(Long id) throws BadConsumerException {
        return consumerDao.findById(id).orElse(null);
    }

    @Override
    public Consumer add(Consumer consumer) throws BadConsumerException {
        if(consumer.getCustId()!=null && consumerDao.existsById(consumer.getCustId()))
            throw new BadConsumerException("Record Exists Already");
        return consumerDao.save(consumer);
    }
}
