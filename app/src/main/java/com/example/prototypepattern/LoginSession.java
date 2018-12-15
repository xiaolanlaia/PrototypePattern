package com.example.prototypepattern;

/**
 * Created by W on 2018/12/15.
 */

public class LoginSession {
    static LoginSession sLoginSession = null;

    /**
     * 已登录用户
     */
    private User loginedUser;
    private LoginSession(){

    }
    public static LoginSession getsLoginSession(){
        if (sLoginSession == null){
            sLoginSession = new LoginSession();
        }
        return sLoginSession;
    }

    /**
     * 设置已登录用户，不对外开放
     */
    void setLoginedUser(User user){
        loginedUser = user;
    }
    public User getLoginedUser(){
        return loginedUser.clone();
    }
}
