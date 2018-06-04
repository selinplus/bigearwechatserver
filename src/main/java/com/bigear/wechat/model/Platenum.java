package com.bigear.wechat.model;

import javax.persistence.*;

public class Platenum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    private String platenum;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return customer_id
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * @return platenum
     */
    public String getPlatenum() {
        return platenum;
    }

    /**
     * @param platenum
     */
    public void setPlatenum(String platenum) {
        this.platenum = platenum;
    }
}