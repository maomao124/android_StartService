package mao.android_startservice.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service
{

    /**
     * 标签
     */
    private static final String TAG = "MyService";

    public MyService()
    {
    }

    @Override
    public IBinder onBind(Intent intent)
    {
        Log.d(TAG, "onBind: ");
        return null;
    }

    @Override
    public void onCreate()
    {
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Log.d(TAG, "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy()
    {
        Log.d(TAG, "onDestroy: ");
    }
}