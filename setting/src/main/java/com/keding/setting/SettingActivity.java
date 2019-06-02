package com.keding.setting;

import android.app.Activity;
import android.os.Bundle;

import com.keding.router.LoginService;

import java.util.ServiceLoader;

/**
 * @author: skd
 * @date 2019-06-02
 * @Desc SettingActivity
 */
public class SettingActivity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ServiceLoader<LoginService> loader = ServiceLoader.load(LoginService.class);
        loader.iterator().next().gotoLogin();
    }
}
