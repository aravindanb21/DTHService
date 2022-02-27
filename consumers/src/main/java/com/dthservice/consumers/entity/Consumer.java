package com.dthservice.consumers.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.loader.plan.spi.BidirectionalEntityReference;

import javax.persistence.*;

@Entity
@Table(name="consumer")
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custId;
    private String name;
    private String mobile;
    private String email;

    public Consumer() {
        super();
    }

    public Consumer(Long custId, String name, String mobile, String email) {
        this.custId = custId;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
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
