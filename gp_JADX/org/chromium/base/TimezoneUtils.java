package org.chromium.base;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.TimeZone;
import org.chromium.base.annotations.CalledByNative;

class TimezoneUtils {
    private TimezoneUtils() {
    }

    @CalledByNative
    private static String getDefaultTimeZoneId() {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }
}
