package com.bigear.wechat.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_setting")
public class OrderSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "hour_amount")
    private Long hourAmount;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return hour_amount
     */
    public Long getHourAmount() {
        return hourAmount;
    }

    /**
     * @param hourAmount
     */
    public void setHourAmount(Long hourAmount) {
        this.hourAmount = hourAmount;
    }

    /**
     * @return start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return end_date
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}