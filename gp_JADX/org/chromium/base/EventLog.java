package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

public class EventLog {
    @CalledByNative
    public static void writeEvent(int i, int i2) {
        android.util.EventLog.writeEvent(i, i2);
    }
}
