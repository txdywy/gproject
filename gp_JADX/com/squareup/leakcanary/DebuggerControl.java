package com.squareup.leakcanary;

public interface DebuggerControl {
    public static final DebuggerControl NONE = new C75721();

    class C75721 implements DebuggerControl {
        C75721() {
        }

        public boolean isDebuggerAttached() {
            return false;
        }
    }

    boolean isDebuggerAttached();
}
