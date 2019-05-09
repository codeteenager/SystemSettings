## 系统设置
![](https://ws3.sinaimg.cn/large/006tNc79gy1g2vht8c0ooj30f60p4q3y.jpg)

打开系统设置代码。
```java
Intent mIntent = new Intent(Settings.ACTION_SETTINGS);
startActivity(mIntent);
```

+ 设置界面：Settings.ACTION_SETTINGS
+ 移动网络设置界面：Settings.ACTION_DATA_ROAMING_SETTINGS
+ wifi列表界面：Settings.ACTION_WIFI_SETTINGS
+ 开发人员选项界面：Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS
+ 应用程序列表界面：Settings.ACTION_APPLICATION_SETTINGS
+ 蓝牙设置界面：Settings.ACTION_BLUETOOTH_SETTINGS
+ 日期时间设置界面：Settings.ACTION_DATE_SETTINGS
+ 手机状态界面：Settings.ACTION_DEVICE_INFO_SETTINGS
+ 手机显示界面：Settings.ACTION_DISPLAY_SETTINGS
+ 辅助功能界面：Settings.ACTION_ACCESSIBILITY_SETTINGS
+ 语言和输入设备：Settings.ACTION_INPUT_METHOD_SETTINGS
+ 语言选择界面：Settings.ACTION_LOCALE_SETTINGS
+ 存储设置：Settings.ACTION_INTERNAL_STORAGE_SETTINGS
+ 位置服务界面：Settings.ACTION_LOCATION_SOURCE_SETTINGS
+ 设置选择网络运营商：Settings.ACTION_NETWORK_OPERATOR_SETTINGS
+ NFC共享设置：Settings.ACTION_NFC_SETTINGS
+ APN设置界面：Settings.ACTION_APN_SETTINGS
+ 备份和重置界面：Settings.ACTION_PRIVACY_SETTINGS
+ 快速启动设置界面：Settings.ACTION_QUICK_LAUNCH_SETTINGS
+ 搜索设置界面：Settings.ACTION_SEARCH_SETTINGS
+ 安全设置界面：Settings.ACTION_SECURITY_SETTINGS
+ 声音设置界面：Settings.ACTION_SOUND_SETTINGS
+ 账户同步界面：Settings.ACTION_SYNC_SETTINGS
+ 添加帐户界面：Settings.ACTION_ADD_ACCOUNT
+ 用户字典界面：Settings.ACTION_USER_DICTIONARY_SETTINGS
+ IP设定界面：Settings.ACTION_WIFI_IP_SETTINGS
+ 互动屏保：Settings.ACTION_DREAM_SETTINGS