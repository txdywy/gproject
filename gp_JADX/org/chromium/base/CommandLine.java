package org.chromium.base;

import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {
    public static final AtomicReference f40485a = new AtomicReference();

    public static CommandLine m37786c() {
        return (CommandLine) f40485a.get();
    }

    private static native void nativeAppendSwitch(String str);

    private static native void nativeAppendSwitchWithValue(String str, String str2);

    private static native void nativeAppendSwitchesAndArguments(String[] strArr);

    private static native String nativeGetSwitchValue(String str);

    private static native boolean nativeHasSwitch(String str);

    private static native void nativeInit(String[] strArr);

    public abstract boolean m37787a();

    public abstract String m37788b();

    private CommandLine() {
    }
}
