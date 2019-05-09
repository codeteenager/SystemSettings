package com.codeteenager.systemsettings;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private SettingsAdapter settingsAdapter;
    private List<String> data = new ArrayList<>();
    private List<String> intentData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        data.add("设置");
        intentData.add(Settings.ACTION_SETTINGS);
        data.add("备份和重置");
        intentData.add(Settings.ACTION_PRIVACY_SETTINGS);
        data.add("辅助功能");
        intentData.add(Settings.ACTION_ACCESSIBILITY_SETTINGS);
        data.add("关于手机");
        intentData.add(Settings.ACTION_DEVICE_INFO_SETTINGS);
        data.add("无线设置");
        intentData.add(Settings.ACTION_WIFI_SETTINGS);
        data.add("应用管理");
        intentData.add(Settings.ACTION_APPLICATION_SETTINGS);
        data.add("开发人员选项");
        intentData.add(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS);
        data.add("语言和输入设备");
        intentData.add(Settings.ACTION_INPUT_METHOD_SETTINGS);
        data.add("安全设置");
        intentData.add(Settings.ACTION_SECURITY_SETTINGS);
        data.add("手机显示");
        intentData.add(Settings.ACTION_DISPLAY_SETTINGS);
        data.add("内部存储");
        intentData.add(Settings.ACTION_INTERNAL_STORAGE_SETTINGS);
        data.add("外部存储");
        intentData.add(Settings.ACTION_MEMORY_CARD_SETTINGS);
        data.add("日期和时间");
        intentData.add(Settings.ACTION_DATE_SETTINGS);
        data.add("移动网络设置");
        intentData.add(Settings.ACTION_DATA_ROAMING_SETTINGS);
        data.add("蓝牙设置");
        intentData.add(Settings.ACTION_BLUETOOTH_SETTINGS);
        data.add("位置服务");
        intentData.add(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    }

    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerview);
        settingsAdapter = new SettingsAdapter(this, data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        // 设置布局管理器
        mRecyclerView.setLayoutManager(linearLayoutManager);
        // 设置adapter
        mRecyclerView.setAdapter(settingsAdapter);
        // 设置Item添加和移除的动画
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // 设置Item之间间隔样式(分割线)
        mRecyclerView.addItemDecoration(new DividerItemDecoration(
                this, DividerItemDecoration.VERTICAL));
        settingsAdapter.setItemClickListener(new SettingsAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                openSystemSetting(intentData.get(position));
            }
        });
    }

    private void openSystemSetting(String intent) {
        Intent mIntent = new Intent(intent);
        startActivity(mIntent);
    }
}
