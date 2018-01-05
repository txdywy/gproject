package com.google.android.instantapps.supervisor.syscall;

public class InputChannelControl extends C5843a {
    public native int nativePollUnresponsiveInputChannel();

    public native int nativeRegisterInputChannel(int i);

    public native void nativeUnregisterInputChannel(int i);
}
