package com.zds.mandroid.hook;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import com.zds.mandroid.interfaces.IInjecter;
import com.zds.mandroid.mirror.ActivityThread;

public class AppInstrumentation  extends InstrumentationDelegate implements IInjecter {

    public void inject() {
        base = ActivityThread.mInstrumentation.get(ActivityThread.currentActivityThread.call());
        ActivityThread.mInstrumentation.set(ActivityThread.currentActivityThread.call(), this);
    }

    public void callActivityOnCreate(Activity activity, Bundle icicle) {
        super.callActivityOnCreate(activity,icicle);
        Log.e("mandroid", "callActivityOnCreate");
    }

    public void callActivityOnCreate(Activity activity, Bundle icicle, PersistableBundle persistentState) {
        super.callActivityOnCreate(activity,icicle,persistentState);
        Log.e("mandroid", "callActivityOnCreate");

    }

    public void callActivityOnDestroy(Activity activity) {
        super.callActivityOnDestroy(activity);
        Log.e("mandroid", "callActivityOnDestroy");

    }

    public void callActivityOnRestoreInstanceState(Activity activity, Bundle savedInstanceState) {
        super.callActivityOnRestoreInstanceState(activity, savedInstanceState);
        Log.e("mandroid", "callActivityOnRestoreInstanceState");

    }

    public void callActivityOnRestoreInstanceState(Activity activity, Bundle savedInstanceState, PersistableBundle persistentState) {
        super.callActivityOnRestoreInstanceState(activity,savedInstanceState,persistentState);
        Log.e("mandroid", "callActivityOnRestoreInstanceState");

    }

    public void callActivityOnPostCreate(Activity activity, Bundle icicle) {
        super.callActivityOnPostCreate(activity,icicle);
        Log.e("mandroid", "callActivityOnPostCreate");

    }

    public void callActivityOnPostCreate(Activity activity, Bundle icicle, PersistableBundle persistentState) {
        super.callActivityOnPostCreate(activity,icicle,persistentState);
        Log.e("mandroid", "callActivityOnPostCreate");

    }

    public void callActivityOnNewIntent(Activity activity, Intent intent) {
        super.callActivityOnNewIntent(activity,intent);
        Log.e("mandroid", "callActivityOnNewIntent");

    }

    public void callActivityOnStart(Activity activity) {
        super.callActivityOnStart(activity);
        Log.e("mandroid", "callActivityOnStart");

    }

    public void callActivityOnRestart(Activity activity) {
        super.callActivityOnRestart(activity);
        Log.e("mandroid", "callActivityOnRestart");

    }

    public void callActivityOnResume(Activity activity) {
        super.callActivityOnResume(activity);
        Log.e("mandroid", "callActivityOnResume");

    }

    public void callActivityOnStop(Activity activity) {
        super.callActivityOnStop(activity);
        Log.e("mandroid", "callActivityOnStop");

    }

    public void callActivityOnSaveInstanceState(Activity activity, Bundle outState) {
        super.callActivityOnSaveInstanceState(activity,outState);
        Log.e("mandroid", "callActivityOnSaveInstanceState");

    }

    public void callActivityOnSaveInstanceState(Activity activity, Bundle outState, PersistableBundle outPersistentState) {
        super.callActivityOnSaveInstanceState(activity,outState,outPersistentState);
        Log.e("mandroid", "callActivityOnSaveInstanceState");

    }

    public void callActivityOnPause(Activity activity) {
        super.callActivityOnPause(activity);
        Log.e("mandroid", "callActivityOnPause");

    }

    public void callActivityOnUserLeaving(Activity activity) {
        super.callActivityOnUserLeaving(activity);
        Log.e("mandroid", "callActivityOnUserLeaving");

    }








}
