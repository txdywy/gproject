package org.chromium.base.library_loader;

import org.chromium.base.library_loader.Linker.LibInfo;

class ModernLinker extends Linker {
    private ModernLinker() {
    }

    private static native boolean nativeCreateSharedRelro(String str, long j, String str2, LibInfo libInfo);

    private static native String nativeGetCpuAbi();

    private static native boolean nativeLoadLibrary(String str, long j, LibInfo libInfo);
}
