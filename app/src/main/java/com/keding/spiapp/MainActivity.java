package com.keding.spiapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.keding.router.SettingService;

import java.util.ServiceLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceLoader<SettingService> loader = ServiceLoader.load(SettingService.class);
        loader.iterator().next().gotoSetting(this);
    }
}
