package com.dthservice.consumers.entity;

import javax.persistence.*;

@Entity
@Table(name="consumer")
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conId;
    private String name;
    private String mobile;
    private String email;

    public Consumer() {
        super();
    }

    public Consumer(Long conId, String name, String mobile, String email) {
        this.conId = conId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public Long getConId() {
        return conId;
    }

    public void setConId(Long conId) {
        this.conId = conId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
