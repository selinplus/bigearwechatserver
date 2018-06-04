package com.bigear.wechat.model;

import javax.persistence.*;

public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String platenum;

    private String photo;

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
     * @return photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
}