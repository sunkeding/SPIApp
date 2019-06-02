package com.keding.login;

import android.util.Log;

import com.keding.router.LoginService;

/**
 * @author: skd
 * @date 2019-06-02
 * @Desc LoginServiceImp
 */
public class LoginServiceImp implements LoginService {
    @Override
    public void gotoLogin() {
        Log.d("skd","登录模块");
    }
}
