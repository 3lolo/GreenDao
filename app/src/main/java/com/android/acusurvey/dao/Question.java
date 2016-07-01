package com.android.acusurvey.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "QUESTION".
 */
public class Question {

    private Long id;
    private Integer gid;
    private Integer sid;
    private String type;
    private String title;
    private String question;
    private String help;
    private String mandatory;
    private String relevance;
    private String attributes;
    private Integer question_order;

    public Question() {
    }

    public Question(Long id) {
        this.id = id;
    }

    public Question(Long id, Integer gid, Integer sid, String type, String title, String question, String help, String mandatory, String relevance, String attributes, Integer question_order) {
        this.id = id;
        this.gid = gid;
        this.sid = sid;
        this.type = type;
        this.title = title;
        this.question = question;
        this.help = help;
        this.mandatory = mandatory;
        this.relevance = relevance;
        this.attributes = attributes;
        this.question_order = question_order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Integer getQuestion_order() {
        return question_order;
    }

    public void setQuestion_order(Integer question_order) {
        this.question_order = question_order;
    }

}
