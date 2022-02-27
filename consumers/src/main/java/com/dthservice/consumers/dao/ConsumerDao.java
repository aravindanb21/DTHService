package com.dthservice.consumers.dao;

import com.dthservice.consumers.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerDao extends JpaRepository<Consumer, Long> {
}
