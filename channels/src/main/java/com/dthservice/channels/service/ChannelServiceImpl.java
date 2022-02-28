package com.dthservice.channels.service;

import com.dthservice.channels.dao.ChannelDao;
import com.dthservice.channels.entity.ChannelDetail;
import com.dthservice.channels.exception.BadChannelException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelServiceImpl implements ChannelService{

    @Autowired
    private ChannelDao channelDao;

    @Override
    public ChannelDetail getById(Long chId) throws BadChannelException {
        return channelDao.findById(chId).orElse(null);
    }

    @Override
    public ChannelDetail addChannel(ChannelDetail channelDetail) throws BadChannelException {
        if(channelDetail.getChId()!=null && channelDao.existsById(channelDetail.getChId()))
            throw new BadChannelException("This Channel already exists");
        return channelDao.save(channelDetail);
    }

    @Override
    public ChannelDetail modifyChannel(ChannelDetail channelDetail) throws BadChannelException {
        if(channelDetail.getChId()==null && !channelDao.existsById(channelDetail.getChId()))
            throw new BadChannelException("This Channel Does Not Exists Hence Can Not Be Modified");
        return channelDao.save(channelDetail);
    }

    @Override
    public void deleteChannelById(Long id) throws BadChannelException {
        channelDao.deleteById(id);
    }
}
