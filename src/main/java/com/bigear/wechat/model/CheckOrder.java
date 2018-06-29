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

    @Column(name = "env_check_type")
    private String envCheckType;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "order_num")
    private String orderNum;

    @Column(name = "total_fee")
    private Float totalFee;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "pay_status")
    private String payStatus;

    @Column(name = "vehicle_type_fee")
    private Float vehicleTypeFee;

    @Column(name = "secu_addition_fee")
    private Float secuAdditionFee;

    @Column(name = "env_check_type_fee")
    private Float envCheckTypeFee;

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
     * @return env_check_type
     */
    public String getEnvCheckType() {
        return envCheckType;
    }

    /**
     * @param envCheckType
     */
    public void setEnvCheckType(String envCheckType) {
        this.envCheckType = envCheckType;
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
     * @return total_fee
     */
    public Float getTotalFee() {
        return totalFee;
    }

    /**
     * @param totalFee
     */
    public void setTotalFee(Float totalFee) {
        this.totalFee = totalFee;
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

    /**
     * @return vehicle_type_fee
     */
    public Float getVehicleTypeFee() {
        return vehicleTypeFee;
    }

    /**
     * @param vehicleTypeFee
     */
    public void setVehicleTypeFee(Float vehicleTypeFee) {
        this.vehicleTypeFee = vehicleTypeFee;
    }

    /**
     * @return secu_addition_fee
     */
    public Float getSecuAdditionFee() {
        return secuAdditionFee;
    }

    /**
     * @param secuAdditionFee
     */
    public void setSecuAdditionFee(Float secuAdditionFee) {
        this.secuAdditionFee = secuAdditionFee;
    }

    /**
     * @return env_check_type_fee
     */
    public Float getEnvCheckTypeFee() {
        return envCheckTypeFee;
    }

    /**
     * @param envCheckTypeFee
     */
    public void setEnvCheckTypeFee(Float envCheckTypeFee) {
        this.envCheckTypeFee = envCheckTypeFee;
    }
}