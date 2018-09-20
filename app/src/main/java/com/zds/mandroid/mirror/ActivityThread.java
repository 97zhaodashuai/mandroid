package com.zds.mandroid.mirror;

import android.app.Application;
import android.app.Instrumentation;
import android.os.Handler;

public class ActivityThread {

    public static Class<?> TYPE = RefClass.load(ActivityThread.class, "android.app.ActivityThread");
    public static RefStaticMethod currentActivityThread;
    public static RefObject<Handler> mH;
    public static RefObject<Instrumentation> mInstrumentation;

    public static class H {
        public static Class<?> TYPE = RefClass.load(H.class, "android.app.ActivityThread$H");
        public static RefStaticInt LAUNCH_ACTIVITY;
        public static RefStaticInt CREATE_SERVICE;
        public static RefStaticInt SCHEDULE_CRASH;
    }
}
