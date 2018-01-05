package org.chromium.net;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import org.chromium.base.annotations.CalledByNative;

public class AndroidCellularSignalStrength {
    public static final AndroidCellularSignalStrength f40565b = new AndroidCellularSignalStrength();
    public volatile int f40566a = Integer.MIN_VALUE;

    private AndroidCellularSignalStrength() {
        if (VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new C7927a(this));
        }
    }

    @TargetApi(23)
    @CalledByNative
    private static int getSignalStrengthLevel() {
        return f40565b.f40566a;
    }
}
