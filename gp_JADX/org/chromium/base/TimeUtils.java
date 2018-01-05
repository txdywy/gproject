package org.chromium.base;

public class TimeUtils {
    private TimeUtils() {
    }

    public static native long nativeGetTimeTicksNowUs();
}
