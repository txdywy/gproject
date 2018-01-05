package com.google.android.instantapps.supervisor.syscall;

public class FeatureControl extends C5843a {
    public static native void removeEnabledFeaturesNative(String[] strArr);

    public static native void setEnabledFeaturesNative(String[] strArr);
}
