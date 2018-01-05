package org.chromium.base;

public class CpuFeatures {
    private static native int nativeGetCoreCount();

    private static native long nativeGetCpuFeatures();
}
