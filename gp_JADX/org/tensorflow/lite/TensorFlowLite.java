package org.tensorflow.lite;

import java.io.PrintStream;

public final class TensorFlowLite {
    private TensorFlowLite() {
    }

    public static native String version();

    static boolean m38277a() {
        try {
            System.loadLibrary("tensorflowlite_jni");
            return true;
        } catch (UnsatisfiedLinkError e) {
            PrintStream printStream = System.err;
            String str = "TensorFlowLite: failed to load native library: ";
            String valueOf = String.valueOf(e.getMessage());
            printStream.println(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return false;
        }
    }

    static {
        m38277a();
    }
}
