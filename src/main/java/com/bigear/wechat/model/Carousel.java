package com.bigear.wechat.model;

import javax.persistence.*;

public class Carousel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "module_info_id")
    private Long moduleInfoId;

    private String realname;

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
     * @return module_info_id
     */
    public Long getModuleInfoId() {
        return moduleInfoId;
    }

    /**
     * @param moduleInfoId
     */
    public void setModuleInfoId(Long moduleInfoId) {
        this.moduleInfoId = moduleInfoId;
    }

    /**
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }
}