package org.chromium.base;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

final class C7894k implements ComponentCallbacks2 {
    C7894k() {
    }

    public final void onTrimMemory(int i) {
        MemoryPressureListener.m37800a(i);
    }

    public final void onLowMemory() {
        MemoryPressureListener.nativeOnMemoryPressure(2);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }
}
