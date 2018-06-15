package com.bigear.wechat.model;

import javax.persistence.*;

public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String photo;

    @Column(name = "platenum_id")
    private Long platenumId;

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

    /**
     * @return platenum_id
     */
    public Long getPlatenumId() {
        return platenumId;
    }

    /**
     * @param platenumId
     */
    public void setPlatenumId(Long platenumId) {
        this.platenumId = platenumId;
    }
}