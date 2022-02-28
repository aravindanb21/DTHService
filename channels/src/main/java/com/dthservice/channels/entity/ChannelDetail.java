package com.dthservice.channels.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.persistence.*;

@Entity
@Table(name = "channels")
public class ChannelDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chId;
    private String title;
    private int ratePerMonth;
    @ManyToOne
    @JoinColumn(name = "conId")
    @JsonProperty(access = Access.WRITE_ONLY)
    private Consumer consumer;

    public Long getChId() {
        return chId;
    }

    public void setChId(Long chId) {
        this.chId = chId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRatePerMonth() {
        return ratePerMonth;
    }

    public void setRatePerMonth(int ratePerMonth) {
        this.ratePerMonth = ratePerMonth;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public ChannelDetail(Long chId, String title, int ratePerMonth, Consumer consumer) {
        this.chId = chId;
        this.title = title;
        this.ratePerMonth = ratePerMonth;
        this.consumer = consumer;
    }

    public ChannelDetail() {
        super();
    }
}
