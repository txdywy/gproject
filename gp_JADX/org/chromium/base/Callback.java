package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

public interface Callback {

    public class Helper {
        @CalledByNative
        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.m37785a();
        }

        @CalledByNative
        static void onBooleanResultFromNative(Callback callback, boolean z) {
            Boolean.valueOf(z);
            callback.m37785a();
        }

        @CalledByNative
        static void onIntResultFromNative(Callback callback, int i) {
            Integer.valueOf(i);
            callback.m37785a();
        }
    }

    void m37785a();
}
