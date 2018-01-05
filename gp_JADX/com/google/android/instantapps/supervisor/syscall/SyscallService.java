package com.google.android.instantapps.supervisor.syscall;

import android.os.Parcel;

public class SyscallService extends C5843a {
    private static native boolean createSyscallHookCache(int i);

    private static native long createSyscallServerNative(String str, String[] strArr);

    private static native void destroySyscallServerNative();

    private static native String dumpNative();

    private static native boolean registerInstantAppPackageNative(long j, int i, String str);

    private static native boolean unregisterInstantAppPackageNative(long j, int i, String str);

    private static native void writeToParcelNative(long j, Parcel parcel);

    protected void finalize() {
        throw new NoSuchMethodError();
    }
}
