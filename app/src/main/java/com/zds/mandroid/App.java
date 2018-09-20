package com.zds.mandroid;

import android.app.Application;

import com.zds.mandroid.hook.AppInstrumentation;

public class App extends Application {

    public void onCreate(){
        super.onCreate();

        hookUtils.addInject(new AppInstrumentation());
        hookUtils.injectAll();

    }





}
