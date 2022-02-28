package com.dthservice.channels.dao;

import com.dthservice.channels.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerDao extends JpaRepository<Consumer, Long> {
}
