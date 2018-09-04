package com.bigear.wechat.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "customer_voice")
public class CustomerVoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ask_content")
    private String askContent;

    @Column(name = "answer_content")
    private String answerContent;

    @Column(name = "is_display")
    private String isDisplay;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "is_reply")
    private String isReply;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return ask_content
     */
    public String getAskContent() {
        return askContent;
    }

    /**
     * @param askContent
     */
    public void setAskContent(String askContent) {
        this.askContent = askContent;
    }

    /**
     * @return answer_content
     */
    public String getAnswerContent() {
        return answerContent;
    }

    /**
     * @param answerContent
     */
    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    /**
     * @return is_display
     */
    public String getIsDisplay() {
        return isDisplay;
    }

    /**
     * @param isDisplay
     */
    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay;
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return is_reply
     */
    public String getIsReply() {
        return isReply;
    }

    /**
     * @param isReply
     */
    public void setIsReply(String isReply) {
        this.isReply = isReply;
    }
}