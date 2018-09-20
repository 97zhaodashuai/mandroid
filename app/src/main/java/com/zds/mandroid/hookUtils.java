package com.zds.mandroid;

import com.zds.mandroid.interfaces.IInjecter;

import java.util.HashMap;
import java.util.Map;

public class hookUtils {
    public void hookActivityThreadHandler() throws Exception {
//
//        Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
//        Method currentActivityThreadMethod = activityThreadClass.getDeclaredMethod("currentActivityThread");
//        currentActivityThreadMethod.setAccessible(true);
//        Object currentActivityThread = currentActivityThreadMethod.invoke(null);
//        Field mHField = activityThreadClass.getDeclaredField("mH");
//        mHField.setAccessible(true);
//        Handler mH = (Handler) mHField.get(currentActivityThread);
//        Field mCallBackField = Handler.class.getDeclaredField("mCallback");
//        mCallBackField.setAccessible(true);
//        mCallBackField.set(mH, new HCallbackStub(mH));

    }
    private static  Map<Class<?>, IInjecter> mInjectors = new HashMap<>(13);

    public static void addInject(IInjecter IInjector){
        mInjectors.put(IInjector.getClass(), IInjector);
    }

    public static void injectAll(){
        for (IInjecter injector : mInjectors.values()) {
            injector.inject();
        }
    }





}
