package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

public class MemoryPressureListener {
    private static native void nativeOnMemoryPressure(int i);

    @CalledByNative
    private static void registerSystemCallback() {
        C7888e.f40514a.registerComponentCallbacks(new C7894k());
    }

    public static void m37800a(int i) {
        if (i >= 80) {
            nativeOnMemoryPressure(2);
        } else if (i >= 40 || i == 15) {
            nativeOnMemoryPressure(1);
        }
    }
}
