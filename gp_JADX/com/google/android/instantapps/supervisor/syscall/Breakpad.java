package com.google.android.instantapps.supervisor.syscall;

public class Breakpad extends C5843a {
    public native void install(int i);

    public native boolean setPackageName(String str);

    public native void uninstall();
}
