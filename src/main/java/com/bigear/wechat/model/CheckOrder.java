package com.bigear.wechat.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "check_order")
public class CheckOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String phone;

    private String platenum;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "secu_addition")
    private String secuAddition;

    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "env_check")
    private String envCheck;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "order_num")
    private String orderNum;

    private Float price;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "pay_status")
    private String payStatus;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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

    /**
     * @return vehicle_type
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return secu_addition
     */
    public String getSecuAddition() {
        return secuAddition;
    }

    /**
     * @param secuAddition
     */
    public void setSecuAddition(String secuAddition) {
        this.secuAddition = secuAddition;
    }

    /**
     * @return fuel_type
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * @return env_check
     */
    public String getEnvCheck() {
        return envCheck;
    }

    /**
     * @param envCheck
     */
    public void setEnvCheck(String envCheck) {
        this.envCheck = envCheck;
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
     * @return payment_method
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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
}