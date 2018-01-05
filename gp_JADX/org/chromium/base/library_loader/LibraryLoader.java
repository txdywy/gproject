package org.chromium.base.library_loader;

import org.chromium.base.annotations.CalledByNative;

public class LibraryLoader {
    public static volatile LibraryLoader f40532a;
    public volatile boolean f40533b;
    public final int f40534c;

    @CalledByNative
    public static int getLibraryProcessType() {
        if (f40532a == null) {
            return 0;
        }
        return f40532a.f40534c;
    }

    private static native boolean nativeForkAndPrefetchNativeLibrary();

    private native String nativeGetVersionNumber();

    private native boolean nativeLibraryLoaded();

    private static native int nativePercentageOfResidentNativeLibraryCode();

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(boolean z, boolean z2, int i, long j);

    private native void nativeRecordLibraryPreloaderBrowserHistogram(int i);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(boolean z, boolean z2, long j);

    private native void nativeRegisterLibraryPreloaderRendererHistogram(int i);

    static {
        Object obj = new Object();
    }
}
