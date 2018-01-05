package org.chromium.base.process_launcher;

public class ChildProcessServiceImpl {
    private static native void nativeExitChildProcess();

    private static native void nativeRegisterFileDescriptors(String[] strArr, int[] iArr, int[] iArr2, long[] jArr, long[] jArr2);
}
