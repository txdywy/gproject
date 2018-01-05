package org.chromium.base.library_loader;

import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.library_loader.Linker.LibInfo;

class LegacyLinker extends Linker {
    private LegacyLinker() {
    }

    private static native boolean nativeCreateSharedRelro(String str, long j, LibInfo libInfo);

    private static native boolean nativeLoadLibrary(String str, long j, LibInfo libInfo);

    private static native boolean nativeLoadLibraryInZipFile(String str, String str2, long j, LibInfo libInfo);

    private static native void nativeRunCallbackOnUiThread(long j);

    private static native boolean nativeUseSharedRelro(String str, LibInfo libInfo);

    @CalledByNative
    public static void postCallbackOnMainThread(long j) {
        ThreadUtils.m37807a(new C7896a(j));
    }
}
