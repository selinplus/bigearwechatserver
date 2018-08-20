package com.bigear.wechat.model;

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

    private String flag;

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
     * @return flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
}