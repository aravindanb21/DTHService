package com.dthservice.channels.service;

import com.dthservice.channels.entity.ChannelDetail;
import com.dthservice.channels.exception.BadChannelException;

public interface ChannelService {
    ChannelDetail getById(Long chId) throws BadChannelException;
    ChannelDetail modifyChannel(ChannelDetail channelDetail) throws BadChannelException;
    ChannelDetail addChannel(ChannelDetail channelDetail) throws  BadChannelException;
    void deleteChannelById(Long id) throws BadChannelException;
}
