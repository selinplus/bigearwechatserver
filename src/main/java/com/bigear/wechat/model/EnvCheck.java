package com.bigear.wechat.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "env_check")
public class EnvCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "fuel_type")
    private String fuelType;

    @Column(name = "initial_check")
    private Float initialCheck;

    @Column(name = "first_recheck")
    private Float firstRecheck;

    @Column(name = "second_recheck")
    private Float secondRecheck;

    @Column(name = "third_recheck")
    private Float thirdRecheck;

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
     * @return initial_check
     */
    public Float getInitialCheck() {
        return initialCheck;
    }

    /**
     * @param initialCheck
     */
    public void setInitialCheck(Float initialCheck) {
        this.initialCheck = initialCheck;
    }

    /**
     * @return first_recheck
     */
    public Float getFirstRecheck() {
        return firstRecheck;
    }

    /**
     * @param firstRecheck
     */
    public void setFirstRecheck(Float firstRecheck) {
        this.firstRecheck = firstRecheck;
    }

    /**
     * @return second_recheck
     */
    public Float getSecondRecheck() {
        return secondRecheck;
    }

    /**
     * @param secondRecheck
     */
    public void setSecondRecheck(Float secondRecheck) {
        this.secondRecheck = secondRecheck;
    }

    /**
     * @return third_recheck
     */
    public Float getThirdRecheck() {
        return thirdRecheck;
    }

    /**
     * @param thirdRecheck
     */
    public void setThirdRecheck(Float thirdRecheck) {
        this.thirdRecheck = thirdRecheck;
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