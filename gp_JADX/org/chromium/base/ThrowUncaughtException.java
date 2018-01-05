package org.chromium.base;

import org.chromium.base.annotations.CalledByNative;

class ThrowUncaughtException {
    ThrowUncaughtException() {
    }

    @CalledByNative
    private static void post() {
        ThreadUtils.m37807a(new C7910v());
    }
}
