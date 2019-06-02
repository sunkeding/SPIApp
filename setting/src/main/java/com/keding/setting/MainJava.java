package com.keding.setting;

import com.keding.router.LoginService;

import java.util.ServiceLoader;

/**
 * @author: skd
 * @date 2019-06-02
 * @Desc MainJava
 */
public class MainJava {
    public static void main(String[] agrs){
        ServiceLoader<LoginService> loader = ServiceLoader.load(LoginService.class);
        loader.iterator().next().gotoLogin();
    }
}
