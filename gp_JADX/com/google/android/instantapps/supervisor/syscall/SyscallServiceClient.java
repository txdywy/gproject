package com.google.android.instantapps.supervisor.syscall;

import android.os.IBinder;
import com.google.android.instantapps.supervisor.event.EventReceiverClient;

public class SyscallServiceClient extends C5843a {
    private static native String dumpNative();

    public static native boolean getGpuProxyingEnabled();

    private static native void installSyscallHooks(int i);

    private static native void setEventReceiverClient(EventReceiverClient eventReceiverClient);

    private static native void setGpuProxyingEnabled(boolean z);

    private static native void setServiceManagerBinder(IBinder iBinder);

    private static native void setSyscallBinder(IBinder iBinder);
}
