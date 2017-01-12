package com.giant_monkey.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by 2525j on 2017-01-12.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("testxxxx", "서비스의 onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("testxxxx", "서비스의 onDestroy");



    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("testxxxx","서비스의 onStartCommand");

        return super.onStartCommand(intent, flags, startId);
    }
}
