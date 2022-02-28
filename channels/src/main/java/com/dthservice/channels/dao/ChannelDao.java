package com.dthservice.channels.dao;

import com.dthservice.channels.entity.ChannelDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelDao extends JpaRepository<ChannelDetail, Long> {
}
