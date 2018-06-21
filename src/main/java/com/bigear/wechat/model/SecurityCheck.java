package com.bigear.wechat.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "security_check")
public class SecurityCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time")
    private Date createTime;

    private Float price;

    @Column(name = "vehicle_type")
    private String vehicleType;

    @Column(name = "vehicle_type_detail")
    private String vehicleTypeDetail;

    private String comments;

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
     * @return vehicle_type_detail
     */
    public String getVehicleTypeDetail() {
        return vehicleTypeDetail;
    }

    /**
     * @param vehicleTypeDetail
     */
    public void setVehicleTypeDetail(String vehicleTypeDetail) {
        this.vehicleTypeDetail = vehicleTypeDetail;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}