package com.example.prototypepattern;



/**
 * Created by W on 2018/12/15.
 */

public class LoginImpl implements Login {

    @Override
    public void login(){
        /**
         * 登录到服务器，获取用户信息
         */
        User loginedUser = new User();
        /**
         * 将服务器返回的完成信息设置给loginedUser对象
         */
        loginedUser.age = 22;
        loginedUser.name = "Mr.Simple";
        loginedUser.address = new Address("北京市","海定区","花园东路");

        /**
         * 登录完成后将用户信息设置到Session中LoginSession.getLoginSession()里
         */
        LoginSession.getsLoginSession().setLoginedUser(loginedUser);
    }
}
