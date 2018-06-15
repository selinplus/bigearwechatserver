package com.bigear.wechat.model;

import java.util.Date;
import javax.persistence.*;

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "order_type")
    private String orderType;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "order_num")
    private String orderNum;

    private Float price;

    @Column(name = "pay_status")
    private String payStatus;

    @Column(name = "pay_num")
    private String payNum;

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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * @return order_type
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * @param orderType
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * @return order_date
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return order_num
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * @param orderNum
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * @return price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return pay_status
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * @param payStatus
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * @return pay_num
     */
    public String getPayNum() {
        return payNum;
    }

    /**
     * @param payNum
     */
    public void setPayNum(String payNum) {
        this.payNum = payNum;
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