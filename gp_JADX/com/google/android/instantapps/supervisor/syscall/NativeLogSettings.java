package com.google.android.instantapps.supervisor.syscall;

import android.util.SparseIntArray;
import com.google.android.instantapps.common.C5804k;

public class NativeLogSettings extends C5843a {
    static {
        SparseIntArray sparseIntArray = new SparseIntArray(5);
        sparseIntArray.put(2, -2);
        sparseIntArray.put(3, -1);
        sparseIntArray.put(4, 0);
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        C5804k c5804k = new C5804k("NativeLogSettings");
    }

    private static native void clearAllLoggingOverrides();

    private static native int getGlobalSeverityLevel();

    private static native int getTagVerbosityOverride(String str);

    public static native void outputTestLogStringToLogcat();

    private static native void setGlobalSeverityLevel(int i);

    private static native void setTagVerbosityOverride(String str, int i);
}
