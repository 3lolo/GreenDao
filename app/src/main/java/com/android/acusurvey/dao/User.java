package com.android.acusurvey.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "USER".
 */
public class User {

    private Long id;
    private String login;
    private String password;
    private String url;
    private String sessionkey;
    private String activeDate;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String login, String password, String url, String sessionkey, String activeDate) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.url = url;
        this.sessionkey = sessionkey;
        this.activeDate = activeDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

    public String getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(String activeDate) {
        this.activeDate = activeDate;
    }

}
