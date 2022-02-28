package com.dthservice.channels.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "consumer")
public class Consumer {

    @Id
    private long conId;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "consumer")
    private Set<ChannelDetail> channelDetail;

    public Consumer() {
    }

    public Consumer(long conId, Set<ChannelDetail> channelDetail) {
        this.conId = conId;
        this.channelDetail = channelDetail;
    }

    public long getConId() {
        return conId;
    }

    public void setConId(long conId) {
        this.conId = conId;
    }

    public Set<ChannelDetail> getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(Set<ChannelDetail> channelDetail) {
        this.channelDetail = channelDetail;
    }
}
