package org.chromium.net;

public final class GURLUtils {
    private static native String nativeGetOrigin(String str);

    private static native String nativeGetScheme(String str);
}
