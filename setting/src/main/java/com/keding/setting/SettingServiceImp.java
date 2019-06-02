package com.keding.setting;

import android.content.Context;
import android.content.Intent;

import com.keding.router.SettingService;

/**
 * @author: skd
 * @date 2019-06-02
 * @Desc SettingServiceImp
 */
public class SettingServiceImp implements SettingService {
    @Override
    public void gotoSetting(Context context) {
        context.startActivity(new Intent(context, SettingActivity.class));

    }
}
