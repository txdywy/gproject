package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

public class JNIUtils {
    public static Boolean f40490a;

    @CalledByNative
    public static Object getClassLoader() {
        return JNIUtils.class.getClassLoader();
    }

    @CalledByNative
    public static boolean isSelectiveJniRegistrationEnabled() {
        if (f40490a == null) {
            f40490a = Boolean.valueOf(false);
        }
        return f40490a.booleanValue();
    }
}
