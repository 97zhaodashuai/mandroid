package com.zds.mandroid;

import android.os.Handler;
import android.os.Message;

import com.zds.mandroid.mirror.ActivityThread;

public class HCallbackStub implements android.os.Handler.Callback{

    public final static int LAUNCH_ACTIVITY = ActivityThread.H.LAUNCH_ACTIVITY.get();

    public Handler mBase;
    public HCallbackStub(Handler base){
        mBase = base;
    }


    @Override
    public boolean handleMessage(Message message) {




        return false;
    }
}
