package com.grp61.app;

import com.opensymphony.xwork2.ActionSupport;

public class LoginController extends ActionSupport {
    private String username, password;
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String execute(){
        LoginDao loginDao = new LoginDaoImpl(username, password);
        if (loginDao.validate()) {
            return "success";
        } else {
            return "error";
        }
    }
}